package cscie55.hw4.bank;

/**
 * Concrete implementation of the Account interface<p>
 * Brendan Murphy 10/29/2018
 * HW 4
 */
public class AccountImpl implements Account{
    private Long balance = 0L;
    private int accountId = 0;

    /**
     * a default no argument constructor
     */
    public AccountImpl(){
    }

    /**
     * constructor that initializes AccountImpl's state.
     * @param id the account id
     */
    public AccountImpl(int id){
        this.accountId = id;
    }

    /**
     * constructor that initializes the AccountImpl's state.
     * @param id the id of the new account
     * @param balance the initial balance
     */
    public AccountImpl(int id, long balance){
        this.accountId = id;
        this.balance = balance;
    }

    /**
     *
     * deposits an amount to the account
     * throws IllegalArgumentException if deposit it less that or equal to zero
     * @param amount the balance to be deposited
     */
    @Override
    public void deposit(long amount){
        if (amount <= 0){
            throw new IllegalArgumentException("deposit amount must be greater than zero");
        }
        else {
            this.balance = this.balance + amount;
        }

    }

    /**
     * returns the account balance
     */
    @Override
    public long getBalance(){
        return this.balance;
    }

    /**
     * withdraws a given amount from the account
     * throws InsufficientFundsException when applicable
     * @param amount the balance to be withdrawn
     */
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

    /**
     * returns the account's id
     */
    @Override
    public int getId(){
        return this.accountId;
    }

}


