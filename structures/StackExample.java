package structures;

import java.util.Stack;

/*
 * A stack is a linear data structure that follows the Last In, First Out (LIFO)
 * principle, where the last element added is the first one to be removed.
 * Common operations include pushing an element onto the stack, popping the
 * top element off, and peeking at the top element without removing it.
 */
public class StackExample {
    public static void main(String[] args) {
        // Example of creating a stack
        Stack<String> stack = new Stack<>();

        // Example of pushing elements
        stack.push("Alice");
        stack.push("Bob");
        System.out.println("Stack: " + stack); // Output: [Alice, Bob]

        // Example of peeking at the top element
        System.out.println("Top element: " + stack.peek()); // Output: Bob

        // Example of popping an element
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement); // Output: Bob
        System.out.println("Stack after pop: " + stack); // Output: [Alice]

        // Example of checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        // Example of getting the size
        System.out.println("Size of stack: " + stack.size()); // Output: 1
    }
}
