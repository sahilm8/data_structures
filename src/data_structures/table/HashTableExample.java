package data_structures.table;

import java.util.Hashtable;

/*
 * A Hashtable is a synchronized data structure in Java that stores
 * key-value pairs, providing thread-safe operations for concurrent
 * access (multi-threaded). Unlike HashMap, it does not allow
 * null keys or values and is generally considered less efficient
 * due to its synchronization overhead.
 */
public class HashTableExample {
    public static void main(String[] args) {
        // Example of creating a hashtable
        Hashtable<String, Integer> ageTable = new Hashtable<>();

        // Example of adding key-value pairs
        ageTable.put("Alice", 30);
        ageTable.put("Bob", 25);
        System.out.println("Age Table: " + ageTable); // Output: {Alice=30, Bob=25}

        // Example of getting keySet
        System.out.println("keySet: " + ageTable.keySet());

        // Example of getting values
        System.out.println("values: " + ageTable.values());

        // Example of getting entrySet
        System.out.println("entrySet: " + ageTable.entrySet());

        // Example of getting a value
        System.out.println("Alice's age: " + ageTable.get("Alice")); // Output: 30

        // Example of removing a key-value pair
        ageTable.remove("Bob");
        System.out.println("After removal: " + ageTable); // Output: {Alice=30}

        // Example of checking if a key exists
        System.out.println("Contains key 'Bob': " + ageTable.containsKey("Bob")); // Output: false

        // Example of checking if a value exists
        System.out.println("Contains value 30: " + ageTable.containsValue(30)); // Output: true

        // Example of getting the size
        System.out.println("Number of entries: " + ageTable.size()); // Output: 1
    }
}
