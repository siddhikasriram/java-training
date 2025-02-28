import java.util.Scanner;
public class ProgramStructure {
    public static void main(String[] args) {
        int number = getInput();
        int square = process(number);
        output(square);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return scanner.nextInt();
    }

    public static int process(int num) {
        return num * num;
    }

    public static void output(int result) {
        System.out.println("Square of the number: " + result);
    }
}