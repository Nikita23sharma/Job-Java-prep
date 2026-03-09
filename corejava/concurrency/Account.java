public class Account {
    int id;
    double balance;
    public Account(int id, double balance) {
        this.id =id;
        this.balance=balance;
    }
    public int getId() {
        return id;
    }
    // public synchronized double getBalance() {
    //     return balance;
    // }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        amount+=balance;
    }
    public void withdraw(double amount) {
       amount -= balance;
    }
    @Override
    public String toString() {
        return "id ->"+id+ " Balance ->"+balance;
    }
    
}

 