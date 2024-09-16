package structures;

import java.util.LinkedList;
import java.util.Queue;

/*
 * A binary tree is a hierarchical data structure in which each node has at
 * most two children, referred to as the left and right child. It is used to
 * represent hierarchical relationships and can be traversed in various ways
 * (in-order, pre-order, post-order, level-order). Binary trees are foundational
 * for more complex structures like binary search trees and heaps.
 */
public class BinaryTreeExample {
    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    private static Node root;

    // add a value
    public void add(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        addValue(root, value);
    }

    // remove a value
    public void remove(int value) {
        if (root == null) {
            return;
        }
        removeValue(root, value);
    }

    // search for a value
    public boolean search(int value) {
        if (root == null) {
            return false;
        }
        return searchValue(root, value);
    }

    private static void addValue(Node node, int value) {
        // level-order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left == null) {
                current.left = new Node(value);
                return;
            }
            if (current.right == null) {
                current.right = new Node(value);
                return;
            }
            queue.add(current.left);
            queue.add(current.right);
        }
    }

    private static void removeValue(Node node, int value) {
        // level-order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        Node nodeToRemove = null;
        Node lastNode = null;
        while (!queue.isEmpty()) {
            lastNode = queue.poll();
            if (lastNode.value == value) {
                nodeToRemove = lastNode;
            }
            if (lastNode.left != null) {
                queue.add(lastNode.left);
            }
            if (lastNode.right != null) {
                queue.add(lastNode.right);
            }
        }
        if (nodeToRemove != null) {
            int lastValue = lastNode.value;
            deleteDeepest(node, lastNode);
            nodeToRemove.value = lastValue;
        }
    }

    private static void deleteDeepest(Node node, Node delNode) {
        if (node == null) {
            return;
        }
        // level-order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        Node temp;
        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (temp == delNode) {
                temp = null;
                return;
            }
            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                }
                queue.add(temp.right);
            }
            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                }
                queue.add(temp.left);
            }
        }
    }

    private static boolean searchValue(Node node, int value) {
        // level-order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.value == value) {
                return true;
            }
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return false;
    }

    // In-order traversal (left, root, right)
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.value + " ");
            traverseInOrder(node.right);
        }
    }

    // Pre-order traversal (root, left, right)
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // Post-order traversal (left, right, root)
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTreeExample bt = new BinaryTreeExample();
        bt.add(1);
        bt.add(2);
        bt.add(3);
        bt.add(4);
        bt.add(5);
        bt.add(6);
        bt.add(7);

        System.out.println("Initial tree:");
        bt.traverseInOrder(root);
        System.out.println();

        System.out.println("Removing 4:");
        bt.remove(4);
        bt.traverseInOrder(root);
        System.out.println();

        System.out.println("Adding 8:");
        bt.add(8);
        bt.traverseInOrder(root);
        System.out.println();

        System.out.println("Searching for 3: " + bt.search(3));
        System.out.println("Searching for 9: " + bt.search(9));
    }
}