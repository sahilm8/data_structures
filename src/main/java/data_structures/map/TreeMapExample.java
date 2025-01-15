package main.java.data_structures.map;

import java.util.TreeMap;

/*
 * It stores key-value pairs in sorted order based on the natural
 * ordering of its keys or a custom Comparator provided at creation time.
 * TreeMap provides guaranteed log(n) time complexity for basic operations
 * like containsKey, get, put, and remove. It's useful when you need a map
 * that maintains its entries in sorted order and allows for efficient range
 * queries and navigation operations.
 */
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Example of adding key-value pairs
        treeMap.put(10, "Ten");
        treeMap.put(1, "One");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");
        treeMap.put(8, "Eight");
        treeMap.put(6, "Six");
        System.out.println("treeMap: " + treeMap);

        // Example of getting keySet
        System.out.println("keySet: " + treeMap.keySet());

        // Example of getting values
        System.out.println("values: " + treeMap.values());

        // Example of getting entrySet
        System.out.println("entrySet: " + treeMap.entrySet());

        // Example of getting a value
        System.out.println("Get value (7): " + treeMap.get(7));

        // Example of removing a key-value pair
        treeMap.remove(8);
        System.out.println("After removal (8): " + treeMap);

        // Example of checking if a key exists
        System.out.println("Contains key (5): " + treeMap.containsKey(5));

        // Example of checking if a value exists
        System.out.println("Contains value (Four): " + treeMap.containsValue("Four"));

        // Example of getting the size
        System.out.println("Number of entries: " + treeMap.size());
    }
}
