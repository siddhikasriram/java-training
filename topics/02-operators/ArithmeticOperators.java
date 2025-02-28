import java.util.*;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a, b;
        Scanner q = new Scanner(System.in);
        a=q.nextInt();
        b=q.nextInt();
        q.close();
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
