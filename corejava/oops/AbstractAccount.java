public abstract class AbstractAccount{

    int AccountNumber;
    double balance;
    public int getAccountNumber() {
        return AccountNumber;
    }
    public AbstractAccount(int accountNumber, double balance) {
        AccountNumber = accountNumber;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
    
    public abstract void withdraw(double amount);
    public abstract void calculateInterest();

}