import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");

        linkedList.remove("Two");

        for (String item : linkedList) {
            System.out.println(item);
        }
    }
}
