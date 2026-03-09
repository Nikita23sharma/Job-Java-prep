public class AbstractionDemo {
    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount(123, 1000);
        ca.deposit(500);
        System.out.println(ca.getBalance());
        ca.withdraw(200);
        System.out.println(ca.getBalance());
        ca.calculateInterest();
        SavingsAccount sa = new SavingsAccount(456, 2000);
        sa.deposit(1000);
        System.out.println(sa.getBalance());
        sa.withdraw(3000);
        System.out.println(sa.getBalance());
        sa.calculateInterest();
    }
}
