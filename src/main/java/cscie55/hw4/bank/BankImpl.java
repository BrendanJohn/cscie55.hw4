package cscie55.hw4.bank;

import java.util.ArrayList;
import java.util.List;

public class BankImpl implements Bank{
	private long totalBalances;
	private Account account;
	private int fromId;
	private int toId;
	private long amount;
	List<Account> accountList = new ArrayList<>();


	@Override
	public long getTotalBalances() {
		return totalBalances;
	}

	@Override
	public void addAccount (Account account) throws DuplicateAccountException{
        accountList.add(account);
	}

	@Override
	public void transferLockingBank(int fromId, int toId, long amount) {

	}

	@Override
	public void transferLockingAccounts(int fromId, int toId, long amount){

	}

	@Override
	public void transferWithoutLocking(int fromId, int toId, long amount) {

	}

	@Override
	public int getNumberOfAccounts(){
		return 1;
	}

	public void BankImpl(){

	}
}
