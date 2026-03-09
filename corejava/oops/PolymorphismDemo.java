public class PolymorphismDemo {
    String name;
    int age;
    static int count;
    public PolymorphismDemo(String name, int age) 
    {
        count++;
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println(name+" is walking");
    }

    public void eat() {
        System.out.println(name+" is eating");
    }

    public void walk(int steps){
        System.out.println(name+" walked "+steps+" steps");
    }

public static void main(String[] args) {
    PolymorphismDemo person = new PolymorphismDemo("John", 30);
    PolymorphismDemo person2 = new PolymorphismDemo("Nikita", 26);
    person.walk();
    person.eat();
    person2.walk(20);
    person2.eat();  
    System.out.println("Total count of person "+person.count);
}}