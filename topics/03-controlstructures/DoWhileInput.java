import java.util.Scanner;
public class DoWhileInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("You entered a valid number: " + number);
        scanner.close();
    }
}