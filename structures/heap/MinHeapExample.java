package structures.heap;

import java.util.ArrayList;

/*
 * A heap is a specialized tree-based data structure that
 * satisfies the heap property. In a min heap, the value of
 * the node is less than or equal to the values of its children.
 * Heaps are commonly used to implement priority queues and for
 * efficient sorting algorithms like heapsort.
 */
public class MinHeapExample {
    private static ArrayList<Integer> minHeap;

    public MinHeapExample() {
        minHeap = new ArrayList<>();
    }

    public void insert(int value) {
        minHeap.add(value);
        heapifyUp(minHeap.size() - 1); // to maintain the max heap property
    }

    public int remove() {
        if (minHeap.isEmpty()) {
            throw new IllegalStateException("minHeap is empty");
        }
        int min = minHeap.get(0);
        int lastElement = minHeap.remove(minHeap.size() - 1);
        if (!minHeap.isEmpty()) {
            minHeap.set(0, lastElement);
            heapifyDown(0); // to maintain the max heap property
        }
        return min;
    }

    public int peek() {
        if (minHeap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return minHeap.get(0);
    }

    private static void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        if (index > 0 && minHeap.get(index) < minHeap.get(parentIndex)) {
            swap(parentIndex, index);
            heapifyUp(parentIndex); // to maintain the max heap property
        }
    }

    private static void heapifyDown(int index) {
        int smallest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        if (leftChild < minHeap.size() && minHeap.get(leftChild) < minHeap.get(smallest)) {
            smallest = leftChild;
        }
        if (rightChild < minHeap.size() && minHeap.get(rightChild) < minHeap.get(smallest)) {
            smallest = rightChild;
        }

        // new smallest is greater than index
        if (smallest < index) {
            swap(index, smallest);
            heapifyDown(smallest); // to maintain the max heap property
        }
    }

    private static void swap(int i, int j) {
        int temp = minHeap.get(i);
        minHeap.set(i, minHeap.get(j));
        minHeap.set(j, temp);
    }

    @Override
    public String toString() {
        return minHeap.toString();
    }

    public static void main(String[] args) {
        MinHeapExample minHeap = new MinHeapExample();
        minHeap.insert(4);
        minHeap.insert(5);
        minHeap.insert(2);
        minHeap.insert(7);
        minHeap.insert(1);

        System.out.println("Heap: " + minHeap);
        System.out.println("Min element: " + minHeap.peek());
        System.out.println("Removed min: " + minHeap.remove());
        System.out.println("Heap after removal: " + minHeap);
    }
}
