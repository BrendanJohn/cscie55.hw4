package cscie55.hw4.bank;

import java.util.HashMap;

/**
 * Concrete implementation of the Bank interface<p>
 * Brendan Murphy 10/29/2018
 * HW 4
 */
public class BankImpl implements Bank {
	private HashMap<Integer, Account> accountsMap = new HashMap<Integer, Account> ();

	/**
	 * return total balance of all accounts in the bank
	 */
	@Override
	public long getTotalBalances() {
		long totalBalances = 0L;
		for (Account account: accountsMap.values()){
			totalBalances += account.getBalance();
		}
		return totalBalances;
	}

	/**
	 * adds an account to the bank's collection of accounts
	 * throws DuplicateAccountException
	 * @param account the account to add to the bank
	 */
	@Override
	public void addAccount (Account account) throws DuplicateAccountException{
		if (accountsMap.containsKey(account.getId())){
			throw new DuplicateAccountException(account.getId());
		}
		else {
			accountsMap.put(account.getId(), account);
		}
	}

	/**
	 * HW4 Requirement:
	 * transfers an amount between two accounts in the bank
	 * locks the bank object in a synchronized block
	 * throws Insufficient Fund Exception
	 * @param fromId, toId, amount
	 */
	@Override
	public void transferLockingBank(int fromId, int toId, long amount)
			throws InsufficientFundsException{
		synchronized (this)	{
			accountsMap.get(fromId).withdraw(amount);
			accountsMap.get(toId).deposit(amount);
		}
	}

	/**
	 * HW4 Requirement:
	 * transfers an amount between two accounts in the bank
	 * locks each account in a synchronized block
	 * throws Insufficient Fund Exception
	 * @param fromId, toId, amount
	 */
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

	/**
	 * HW4 Requirement:
	 * transfers an amount between two accounts in the bank
	 * does not lock the objects in a synchronized block
	 * throws Insufficient Fund Exception
	 * @param fromId, toId, amount
	 */
	@Override
	public void transferWithoutLocking(int fromId, int toId, long amount)
			throws InsufficientFundsException{
		accountsMap.get(fromId).withdraw(amount);
		accountsMap.get(toId).deposit(amount);
	}

	/**
	 * @return number of accounts currently in the back
	 */
	@Override
	public int getNumberOfAccounts(){
		return accountsMap.size();
	}

}
