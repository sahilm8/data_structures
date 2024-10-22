package structures.set;

import java.util.LinkedHashSet;

/*
 * A hybrid between HashSet and LinkedList. It maintains insertion order
 * of elements while still providing the constant-time complexity O(1) for
 * basic operations.
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(100);
        linkedHashSet.add(-50);
        linkedHashSet.add(75);
        linkedHashSet.add(200);
        linkedHashSet.add(-150);
        linkedHashSet.add(25);
        linkedHashSet.add(-25);
        linkedHashSet.add(300);
        System.out.println("linkedHashSet: " + linkedHashSet);

        linkedHashSet.remove(-25);
        System.out.println("After removal (-25): " + linkedHashSet);

        System.out.println("Contains 300: " + linkedHashSet.contains(300));
    }
}