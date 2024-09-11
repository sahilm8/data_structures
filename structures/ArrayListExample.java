package structures;

import java.util.ArrayList;

/*
 * Access: O(1) (constant time)
 * Search: O(n)
 * Insertion at end: O(1)  (constant time)
 * Insertion at specific index: O(n) (need to shift elements)
 * Deletion at end: O(1) (constant time)
 * Deletion at specific index: O(n) (need to shift elements)
 * Space: O(n)
 */

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruits: " + fruits);

        System.out.println("Second fruit: " + fruits.get(1));

        fruits.set(1, "Grapes");
        System.out.println("After modification: " + fruits);

        fruits.remove("Orange");
        System.out.println("After removal: " + fruits);

        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        System.out.println("Number of fruits: " + fruits.size());
    }
}