import java.util.Stack;

public class StackEmptyCheck {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }

        stack.push(10);
        stack.push(20);

        if (!stack.isEmpty()) {
            System.out.println("The stack is not empty after pushing elements.");
        }
    }
}
