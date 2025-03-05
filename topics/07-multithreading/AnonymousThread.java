public class AnonymousThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Anonymous thread running..."));
        t1.start();
    }
}
