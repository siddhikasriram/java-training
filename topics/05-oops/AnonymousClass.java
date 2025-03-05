interface Greeting {
    void sayHello();
}

public class AnonymousClass {
    public static void main(String[] args) {
        // Anonymous inner class implementing the Greeting interface
        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class!");
            }
        };

        greet.sayHello();
    }
}

// Anonymous classes used when we want to implement an abstract class or an interface