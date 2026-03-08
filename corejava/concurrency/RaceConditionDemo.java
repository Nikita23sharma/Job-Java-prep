public class RaceConditionDemo {

    public static void main(String[] args) {
        Account account = new Account(1, 1000);

        Runnable task= ()->{

            for(int i = 0; i<=1000; i++)
            {
                account.withdraw(1);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(account);
    
    }
}

