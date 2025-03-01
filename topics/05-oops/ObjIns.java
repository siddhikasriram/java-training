// Defining the Person class
public class Person {
    private String name;
    private int age;

    // Constructor to initialize the attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Main method to demonstrate object instantiation
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person1 = new Person("Alice", 25);

        // Accessing and printing attributes using getter methods
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
    }
}

