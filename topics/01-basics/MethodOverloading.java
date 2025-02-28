public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(5, 10));
        System.out.println(add(5.5, 2.2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}