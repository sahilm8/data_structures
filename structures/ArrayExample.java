package structures;
/*
 * Arrays
 * Access: O(1) (constant time)
 * Search: O(n)
 * Insertion: O(n) (if you need to shift elements)
 * Deletion: O(n) (if you need to shift elements)
 * Space: O(n)
 */

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("Third element: " + numbers[2]);

        numbers[3] = 15;
        System.out.println("Modified fourth element: " + numbers[3]);
    }
}