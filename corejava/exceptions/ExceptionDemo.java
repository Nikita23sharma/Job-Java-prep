


class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class ExceptionDemo {
    String name;
    int age;
    String email;
    int balance;
    public ExceptionDemo(String name, int age, String email, int balance) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.balance = balance;

    }

    public void validate() throws InvalidAgeException, InvalidEmailException {
        if(age < 0 || age > 150){
            throw new InvalidAgeException("Invalid age: " + age);
        }
        if(!email.contains("@")){
            throw new InvalidEmailException("Invalid email: " + email);
        }
    }   

    public void withdraw(int amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance. Available: " + balance + ", requested: " + amount);
        }
        else{
            balance-=amount;
        }
    }

    public static void main(String[] args) {
        ExceptionDemo person1 = new ExceptionDemo("Nikita", 26, "nikitaas076gmail.com", 1000);
        ExceptionDemo person2 = new ExceptionDemo("Alice", 180, "alice@019gmail.com", 2000);
        try {
            person1.validate();
            System.out.println(person1.name);
        } catch (InvalidAgeException | InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
        try {
            person2.validate();
        } catch (InvalidAgeException | InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
        ExceptionDemo person3 = new ExceptionDemo("Bob", 30, "bob@gmail.com", 10000);
        try{
            person3.withdraw(1000);
            System.out.println("Balance left "+person3.balance);

        }catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}