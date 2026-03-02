package corejava.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.event.SwingPropertyChangeSupport;

public class Account {
    private int id;
    private int balance;

    public Account(int id, int balance){
        this.balance= balance;
        this.id=id;
     };
    
    public int getBalance() {
        return balance;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "id=" + id +  " and" +" balance=" + balance;}

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }


    

public static void main(String[] args) {
        System.out.println("Hello");
        Account acc = new Account(123, 500087);
        Account acc1 = new Account(1, 5000);
        Account acc4 = new Account(1, 5000);
        Account acc2 = new Account(2, 2000);
        Account acc3 = new Account(3, 7000);
        System.out.println("balance"+acc.balance);
        
        System.out.println(acc.getBalance());
        System.out.println(acc.toString());

        List<Account> account = new ArrayList<>(); 
        account.add(acc);
        account.add(acc1);
        account.add(acc2);
        account.add(acc3);
        // account.add(acc4);

        
        System.out.println(account);
        account.forEach(System.out::println);
        account.sort((a1, a2) -> a1.getBalance() - a2.getBalance());
        System.out.println("accounts after sorting"+ account);
        account.stream().filter(a->a.getBalance()>=7000).forEach(System.out::println);

        System.out.println("List turned to a Set");
        Set<Account> accountSet = new HashSet(account);
        accountSet.forEach(System.out::println);

        System.out.println("List turned to a Map");
        Map<Integer, Account> accountMap =
        account.stream()
                .collect(Collectors.toMap(
                        Account::getId,
                        balance -> balance
                ));

        System.out.println("To combine same id");
        Map<Integer, List<Account>> accountMapMerged =
        account.stream()
                .collect(Collectors.groupingBy(Account::getId));


        accountMap.forEach((key, value) ->
        System.out.println(key + " -> " + value));
        
        };

       
        

    }
