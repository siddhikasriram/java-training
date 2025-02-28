import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate, will be ignored

        System.out.println(set);
    }
}
