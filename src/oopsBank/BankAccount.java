package oopsBank;

public abstract class BankAccount {
    protected int balance = 0;

    abstract void Deposit(int amount);
    abstract void Withdraw(int amount);

}
