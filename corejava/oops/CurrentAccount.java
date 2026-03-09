public class CurrentAccount extends AbstractAccount {
    private double balance;

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
        System.out.println("Withdrawn from Current Account: " + amount);
    }

    @Override
    public double getBalance() {
        return balance;
    }
    
    @Override
    public void calculateInterest(){
        System.out.println("Current accounts do not earn interest.");
    }   
    
}
