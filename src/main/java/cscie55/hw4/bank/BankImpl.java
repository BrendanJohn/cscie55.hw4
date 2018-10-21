package cscie55.hw4.bank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BankImpl implements Bank{
	private long totalBalances;
	Set<Account> accounts = new HashSet<>();



	@Override
	public long getTotalBalances() {
		//iterates over set of accounts and sums the balance
		Iterator<Account> account = accounts.iterator();
		while (account.hasNext()) {
                 this.totalBalances = account.next().getBalance() + totalBalances;
			}
			return totalBalances;
	}

	@Override
	public void addAccount (Account account) throws DuplicateAccountException{
		if(accounts.contains(account)){
			throw new DuplicateAccountException(account.getId());
		}
		else {
			accounts.add(account);
		}

	}

	@Override
	public void transferLockingBank(int fromId, int toId, long amount) {

	}

	@Override
	public void transferLockingAccounts(int fromId, int toId, long amount){

	}

	@Override
	public void transferWithoutLocking(int fromId, int toId, long amount) {
		//iterates over set of accounts and finds the right accounts to withdraw
		for(Iterator<Account> account = accounts.iterator(); account.hasNext();) {
            Account current = account.next();
            if (current.getId() == fromId) {
            	try {
            		current.withdraw(amount);
				}
            	catch(InsufficientFundsException I){
            		System.out.println("Insufficient funds");
				}
			}
	}
		//iterates over set of accounts and finds the right accounts to deposit
		for(Iterator<Account> account = accounts.iterator(); account.hasNext();) {
			Account current = account.next();
			if (current.getId() == toId) {
				try {
					current.deposit(amount);
				}
				catch(IllegalArgumentException I){
					System.out.println("deposit amount must be greater than zero");
				}
			}
		}
	}

	@Override
	public int getNumberOfAccounts(){
		return accounts.size();
	}

	public void BankImpl(){

	}
}
