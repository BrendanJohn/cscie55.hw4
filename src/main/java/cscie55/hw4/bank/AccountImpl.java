package cscie55.hw4.bank;

public class AccountImpl implements Account{
    private Long balance;

    public AccountImpl(long value){
        this.balance = value;
    }

    public void deposit(long amount){
        if (amount <= 0){
            throw new IllegalArgumentException("deposit amount must be greater than zero");
        }
        else {
            this.balance = amount;
        }

    }
    public long getBalance(){
        return this.balance;
    }
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

    public int getId(){
        return 0;
    }

}


