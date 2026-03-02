package corejava.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPractice {
    int id;

 public static void main(String[] args)
 {
    HashSet<Integer> hashset =  new HashSet<>();
        hashset.add(40);
        hashset.add(22);
        hashset.add(83);
    System.out.println(hashset);

    Set<Integer> treeset =  new TreeSet(hashset);

    System.out.println(treeset);

    Set<Integer> Linkedset =  new LinkedHashSet<>(hashset);
     System.out.println(treeset);


 }
 }