package data_structures.queue;

import java.util.PriorityQueue;

/*
 * A priority queue is a special type of queue (FIFO) where elements are dequeued based on
 * their priority. It automatically sorts its elements based on their natural order
 * (for comparable objects) or using a custom Comparator. It is commonly used in scenarios
 * where tasks need to be processed based on their importance, such as task scheduling
 * in operating systems or implementing algorithms like Dijkstra's.
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        // Example of creating a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Example of adding elements
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(4);
        System.out.println("Priority Queue: " + priorityQueue); // [1, 3, 4]

        // Example of peeking at the highest priority element
        System.out.println("Highest priority element: " + priorityQueue.peek()); // Output: 1

        // Example of polling the highest priority element
        System.out.println("Polled element: " + priorityQueue.poll()); // Output: 1
        System.out.println("Priority Queue after poll: " + priorityQueue); // [3, 4]

        // Example of checking if the priority queue is empty
        System.out.println("Is priority queue empty? " + priorityQueue.isEmpty()); // Output: false

        // Example of getting the size
        System.out.println("Size of priority queue: " + priorityQueue.size()); // Output: 2
    }
}
