package cscie55.hw4.bank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BankImpl implements Bank{
	private long totalBalances;
	private long amount;
	Set<Account> accounts = new HashSet<>();



	@Override
	public long getTotalBalances() {
		//iterates over set passengers and removes them if destination floor matches current floor
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
		if (accounts.contains(fromId)) {
//do something
		}
	}

	@Override
	public int getNumberOfAccounts(){
		return accounts.size();
	}

	public void BankImpl(){

	}
}
