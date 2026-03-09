
// interface Account {
//     void deposit(double amount);
//     void withdraw(double amount);
//     double getBalance();
// }

public class SavingsAccount extends AbstractAccount {
    private double balance;

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(balance - amount < 500) {
            System.out.println("Minimum balance must be 500");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
    @Override
    public void calculateInterest(){
        double interest = balance * 0.04;
        System.out.println("Savings Interest: " + interest);
    }

}
