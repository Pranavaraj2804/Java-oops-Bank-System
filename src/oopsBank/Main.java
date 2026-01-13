package oopsBank;

public class Main {
    static void main() {
        SavingsAccount account = new SavingsAccount();
        account.Deposit(50000);
        account.Deposit(46000);
        account.Deposit(60000);
        account.Withdraw(56000);
        CurrentAccount account1 = new CurrentAccount();
        account1.Deposit(50000);
        account1.Withdraw(46000);
        account1.Withdraw(9000);


    }
}
