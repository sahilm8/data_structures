package main.java.data_structures.heap;

import java.util.ArrayList;

/*
 * A heap is a specialized tree-based data structure that
 * satisfies the heap property. In a max heap, for any given
 * node, the value of the node is greater than or equal to the
 * values of its children. Heaps are commonly used to implement
 * priority queues and for efficient sorting algorithms like
 * heapsort.
 */
public class MaxHeapExample {
    private static ArrayList<Integer> maxHeap;

    public MaxHeapExample() {
        maxHeap = new ArrayList<>();
    }

    public void insert(int value) {
        maxHeap.add(value);
        heapifyUp(maxHeap.size() - 1); // to maintain the max heap property
    }

    public int remove() {
        if (maxHeap.isEmpty()) {
            throw new IllegalStateException("maxHeap is empty");
        }
        int max = maxHeap.get(0);
        int lastElement = maxHeap.remove(maxHeap.size() - 1);
        if (!maxHeap.isEmpty()) {
            maxHeap.set(0, lastElement);
            heapifyDown(0); // to maintain the max heap property
        }
        return max;
    }

    public int peek() {
        if (maxHeap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return maxHeap.get(0);
    }

    private static void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        if (index > 0 && maxHeap.get(index) > maxHeap.get(parentIndex)) {
            swap(parentIndex, index);
            heapifyUp(parentIndex); // to maintain the max heap property
        }
    }

    private static void heapifyDown(int index) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        if (leftChild < maxHeap.size() && maxHeap.get(leftChild) > maxHeap.get(largest)) {
            largest = leftChild;
        }
        if (rightChild < maxHeap.size() && maxHeap.get(rightChild) > maxHeap.get(largest)) {
            largest = rightChild;
        }
        // new largest is greater than index
        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest); // to maintain the max heap property
        }
    }

    private static void swap(int i, int j) {
        int temp = maxHeap.get(i);
        maxHeap.set(i, maxHeap.get(j));
        maxHeap.set(j, temp);
    }

    @Override
    public String toString() {
        return maxHeap.toString();
    }

    public static void main(String[] args) {
        MaxHeapExample maxHeap = new MaxHeapExample();
        maxHeap.insert(4);
        maxHeap.insert(5);
        maxHeap.insert(15);
        maxHeap.insert(7);
        maxHeap.insert(8);

        System.out.println("Heap: " + maxHeap.toString());
        System.out.println("Max element: " + maxHeap.peek());
        System.out.println("Removed max: " + maxHeap.remove());
        System.out.println("Heap after removal: " + maxHeap.toString());
    }
}
