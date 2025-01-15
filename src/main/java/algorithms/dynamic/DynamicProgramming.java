package main.java.algorithms.dynamic;

/*
 * Dynamic programming is an algorithmic technique that solves complex problems
 * by breaking them down into simpler sub-problems. It stores the results of these
 * sub-problems to avoid redundant computations, thus optimizing the overall solution.
 */
public class DynamicProgramming {
    // Fibonacci example: calculating the fibonacci value
    public static int fibonacci(int n) {
        int[] array = new int[n + 1]; // Claculating from 0 to n, inclusive
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(12)); // Output: 144
    }
}
