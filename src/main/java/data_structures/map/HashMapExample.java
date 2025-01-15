package main.java.data_structures.map;

import java.util.HashMap;

/*
 * A HashMap is a part of Java's collection framework that stores
 * key-value pairs, allowing for efficient retrieval and manipulation
 * of data based on unique keys. It is not synchronized, meaning it
 * is not thread-safe but offers better performance in single-threaded
 * scenarios.
 */

public class HashMapExample {
    public static void main(String[] args) {
        // Example of creating a hashmap
        HashMap<String, Integer> ageMap = new HashMap<>();

        // Example of adding key-value pairs
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        System.out.println("Age Map: " + ageMap); // Output: {Alice=30, Bob=25}

        // Example of getting keySet
        System.out.println("keySet: " + ageMap.keySet());

        // Example of getting values
        System.out.println("values: " + ageMap.values());

        // Example of getting entrySet
        System.out.println("entrySet: " + ageMap.entrySet());

        // Example of getting a value
        System.out.println("Alice's age: " + ageMap.get("Alice")); // Output: 30

        // Example of removing a key-value pair
        ageMap.remove("Bob");
        System.out.println("After removal: " + ageMap); // Output: {Alice=30}

        // Example of checking if a key exists
        System.out.println("Contains key 'Bob': " + ageMap.containsKey("Bob")); // Output: false

        // Example of checking if a value exists
        System.out.println("Contains value 30: " + ageMap.containsValue(30)); // Output: true

        // Example of getting the size
        System.out.println("Number of entries: " + ageMap.size()); // Output: 1
    }
}
