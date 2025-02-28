Object instantiation

public class ObjIns {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());

        Person person2 = new Person("Bob", 30);
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
