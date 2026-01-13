package oopsBank;

public class SavingsAccount extends BankAccount{

    @Override
    void Deposit(int amount) {
        System.out.println("The deposited amount is:"+ amount);
        balance = balance+=amount;
        System.out.println("The balance amount is:"+ balance);

    }

    @Override
    void Withdraw(int amount) {
        if(amount<balance) {
            System.out.println("The Withdraw amount is:" + amount);
            balance-=amount;
            System.out.println("remaining balance"+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }

    }
}
