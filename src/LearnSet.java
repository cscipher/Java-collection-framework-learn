import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {

        // HashSet
        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(2);
        set.add(23);
        set.add(23);
        set.add(9);

        System.out.println(set);

        set.remove(2);
        System.out.println(set.contains(2));
        System.out.println(set.isEmpty());

        // LinkedHashTree
        // All functions same as HashSet but here, the order of the elements is MAINTAINED.

        // TreeSet
        // All functions same as HashSet but here, the order of the elements is SORTED. (uses BST under the hood)

        // Time complexity for insertion
        // HashSet, LinkedHashSet : O(n)
        // TreeSet : O(log(n))



    }
}
