package oopsBank;

public class CurrentAccount extends BankAccount{
   int overdraftLimit = 5000;

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
            balance -= amount;
            System.out.println("balance is:"+balance);
        }
       else if(balance-amount>= -overdraftLimit){
            System.out.println("Extra amount with interest by bank");
            balance -= amount;
            System.out.println("balance is:"+balance);
        }
       else
        System.out.println("Insufficient Balance");
    }
}
