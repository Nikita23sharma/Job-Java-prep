package corejava.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapPractice {
    static int id;
    String name;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMapPractice(int id,String name ){
            this.name = name;
            this.id = id;
    }

    @Override
    public String toString() {
        return "id " + id +" Name "+ name;}


public static void main(String[] args){

    HashMap<Integer, HashMapPractice> hashpractice = new HashMap<>();
    
    hashpractice.put(1, new HashMapPractice(1, "Nikita"));
    hashpractice.put(2, new HashMapPractice(2, "John"));;

    System.out.println(hashpractice);

    System.out.println(hashpractice.entrySet());

    System.out.println(hashpractice.size());
    System.out.println(hashpractice.values());
    // hashpractice.putIfAbsent(3, new HashMapPractice(3, "Some"));
    System.out.println("hashpractice"+ hashpractice);
    Map<Integer, HashMapPractice> sortedHash = new TreeMap<>(hashpractice);
    sortedHash.forEach((key, value) ->
        System.out.println(key + " " + value));

  

    
}
}
