package cscie55.hw4.bank;

public interface Account
{
    int getId();
    void getBalance();
    void deposit(long amount);
    void withdraw(long amount) throws InsufficientFundsException;
}
