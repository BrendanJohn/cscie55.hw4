package cscie55.hw4.bank;

public class BankImpl implements Bank{
	private long totalBalances;
	private Account account;
	private int fromId;
	private int toId;
	private long amount;


	public long getTotalBalances() {
		return totalBalances;
	}

	public void addAccount (Account account) throws DuplicateAccountException{
        this.account = account;
	}

	public void transferLockingBank(int fromId, int toId, long amount) {

	}

	public void transferLockingAccounts(int fromId, int toId, long amount){

	}

	public void transferWithoutLocking(int fromId, int toId, long amount) {

	}

	public int getNumberOfAccounts(){
		return 1;
	}

	public void Bank(){

	}
}
