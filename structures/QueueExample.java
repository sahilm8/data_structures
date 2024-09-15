package structures;

import java.util.LinkedList;
import java.util.Queue;

/*
 * A queue is a linear data structure that follows the First In, First Out (FIFO)
 * principle, where the first element added is the first one to be removed.
 * It is commonly used in scenarios where order of processing is important,
 * such as task scheduling and handling requests.
 */
public class QueueExample {
    public static void main(String[] args) {
        // Example of creating a queue
        Queue<String> queue = new LinkedList<>();

        // Example of enqueueing elements
        queue.add("Alice");
        queue.add("Bob");
        System.out.println("Queue: " + queue); // Output: [Alice, Bob]

        // Example of peeking at the front element
        System.out.println("Front element: " + queue.peek()); // Output: Alice

        // Example of dequeueing an element
        String dequeuedElement = queue.poll();
        System.out.println("Dequeued element: " + dequeuedElement); // Output: Alice
        System.out.println("Queue after dequeue: " + queue); // Output: [Bob]

        // Example of checking if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false

        // Example of getting the size
        System.out.println("Size of queue: " + queue.size()); // Output: 1
    }
}
