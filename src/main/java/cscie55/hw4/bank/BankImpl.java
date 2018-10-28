package cscie55.hw4.bank;

import java.util.HashMap;


public class BankImpl implements Bank {
	private HashMap<Integer, Account> accountsMap = new HashMap<Integer, Account> ();


	@Override
	public long getTotalBalances() {
		long totalBalances = 0L;
		for (Account account: accountsMap.values()){
			totalBalances += account.getBalance();
		}
		return totalBalances;
	}

	@Override
	public void addAccount (Account account) throws DuplicateAccountException{
		if (accountsMap.containsKey(account.getId())){
			throw new DuplicateAccountException(account.getId());
		}
		else {
			accountsMap.put(account.getId(), account);
		}


	}

	@Override
	public void transferLockingBank(int fromId, int toId, long amount)
			throws InsufficientFundsException{
		synchronized (this)	{
			accountsMap.get(fromId).withdraw(amount);
			accountsMap.get(toId).deposit(amount);
		}
	}


	@Override
	public void transferLockingAccounts(int fromId, int toId, long amount)
			throws InsufficientFundsException{
		Account fromAccount = accountsMap.get(fromId);
		Account toAccount = accountsMap.get(toId);

		synchronized (fromAccount) {
			fromAccount.withdraw(amount);

		}
		synchronized(toAccount) {
			toAccount.deposit(amount);
		}
	}

	@Override
	public void transferWithoutLocking(int fromId, int toId, long amount)
			throws InsufficientFundsException{
		accountsMap.get(fromId).withdraw(amount);
		accountsMap.get(toId).deposit(amount);

	}

	@Override
	public int getNumberOfAccounts(){
		return accountsMap.size();
	}

}
