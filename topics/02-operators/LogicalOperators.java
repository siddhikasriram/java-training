public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20;
        boolean condition1 = (a < b);
        boolean condition2 = (a == 10);
        System.out.println("AND (&&): " + (condition1 && condition2));
        System.out.println("OR (||): " + (condition1 || condition2));
        System.out.println("NOT (!): " + (!condition1));
    }
}