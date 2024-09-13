package structures;

import java.util.LinkedList;

/*
 * A LinkedList is a data structure that consists of a sequence of elements,
 * where each element (node) contains a reference to the next (and possibly previous)
 * node, allowing for efficient insertion and deletion operations. It can be used as
 * both a list and a queue, providing flexibility in data management.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        // Example of creating a linked list
        LinkedList<String> names = new LinkedList<>();

        // Example of adding elements
        names.add("Alice");
        names.add("Bob");
        System.out.println("Names: " + names); // Output: [Alice, Bob]

        // Example of getting an element
        System.out.println("First name: " + names.get(0)); // Output: Alice

        // Example of removing an element
        names.remove(1);
        System.out.println("After removal: " + names); // Output: [Alice]

        // Example of getting the size
        System.out.println("Number of names: " + names.size()); // Output: 1

        // Example of adding first and last
        names.addFirst("Charlie");
        names.addLast("David");
        System.out.println("Updated Names: " + names); // Output: [Charlie, Alice, David]
    }
}
