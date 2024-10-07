package structures.list;

import java.util.ArrayList;

/*
 * An ArrayList is a resizable array implementation in Java that
 * allows for dynamic storage of elements, providing flexibility
 * in adding, removing, and accessing elements.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // Example of adding elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("Fruits: " + fruits); // Output: [Apple, Banana]

        // Example of getting an element
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Example of setting an element
        fruits.set(1, "Grapes");
        System.out.println("After modification: " + fruits); // Output: [Apple, Grapes]

        // Example of removing an element
        fruits.remove("Apple");
        System.out.println("After removal: " + fruits); // Output: [Grapes]

        // Example of getting the size
        System.out.println("Number of fruits: " + fruits.size()); // Output: 1

        // Example of adding first and last
        fruits.addFirst("Orange");
        fruits.addLast("Pineapple");
        System.out.println("Updated fruits: " + fruits); // Output: [Grapes, Orange, Pineapple]
    }
}