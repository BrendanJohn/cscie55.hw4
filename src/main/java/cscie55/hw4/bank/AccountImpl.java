package cscie55.hw4.bank;


/**
 * Concrete implementation of the Account interface<p>
 * @Author Brendan Murphy
 * HW 4
 */
public class AccountImpl implements Account{
    private Long balance;
	private int accountId;


    public AccountImpl(long value){
        this.balance = value;
    }

	@Override
    public void deposit(long amount){
        if (amount <= 0){
            throw new IllegalArgumentException("deposit amount must be greater than zero");
        }
        else {
            this.balance = amount;
        }

    }

	@Override
    public long getBalance(){
        return this.balance;
    }

	@Override
    public void withdraw(long amount) throws InsufficientFundsException {
        if (amount <= 0){
            throw new IllegalArgumentException("withdraw amount must be greater than zero");
        }
        else if (amount > this.balance)
        {
            throw new InsufficientFundsException(this, amount);
        }
        else
        {
            this.balance = balance - amount;
        }

    }

	@Override
    public int getId(){
        return this.accountId;
    }

}


