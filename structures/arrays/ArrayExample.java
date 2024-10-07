package structures.arrays;

import java.util.Arrays;

/*
 * An array is a data structure that stores a fixed-size sequence
 * of elements of the same type, allowing for efficient access and
 * manipulation of its elements using an index.
 */
public class ArrayExample {
    public static void main(String[] args) {
        // Example of array length
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("Length of array: " + numbers.length); // Output: 5

        // Example of accessing an element
        System.out.println("Element at index 2: " + numbers[2]); // Output: 3

        // Example of iteration
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num); // Output: 1, 2, 3, 4, 5
        }

        // Example of sorting
        int[] unsorted = { 5, 3, 1, 4, 2 };
        Arrays.sort(unsorted);
        System.out.println("Sorted array: " + Arrays.toString(unsorted)); // Output: [1, 2, 3, 4, 5]

        // Example of searching
        int index = Arrays.binarySearch(unsorted, 3);
        System.out.println("Index of element 3: " + index); // Output: 2 (if sorted)
    }
}