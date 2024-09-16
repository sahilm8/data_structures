package structures;

import java.util.*;

/*
 * Sets are collections that contain no duplicate elements.
 * They model the mathematical set abstraction and are useful
 * for storing unique items or checking for membership.
 * In Java, Set is an interface in the java.util package,
 * with implementations like HashSet, TreeSet, and LinkedHashSet.
 */
public class SetExample {
    public static void main(String[] args) {
        // HashSet example
        // O(1) time for basic operations
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate, won't be added
        hashSet.remove("Orange");
        System.out.println("HashSet: " + hashSet);

        // TreeSet example:
        // Maintains sorted order
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Blueberry");
        treeSet.add("Cherry"); // Duplicate, won't be added
        treeSet.remove("Blueberry");
        System.out.println("TreeSet: " + treeSet);

        // LinkedHashSet example:
        // Maintains insertion order and O(1) time for basic operations
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Lemon");
        linkedHashSet.add("Kiwi"); // Duplicate, won't be added
        linkedHashSet.remove("Lemon");
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}