package structures.tree;

import java.util.*;

/*
 * A binary tree is a hierarchical data structure in which each node has at
 * most two children, referred to as the left and right child. It is used to
 * represent hierarchical relationships and can be traversed in various ways
 * (in-order, pre-order, post-order, level-order). Binary trees are foundational
 * for more complex structures like binary search trees and heaps.
 * 
 * Breadth First Search: Traversing level-by-level using a queue and level-order traversal.
 * Depth First Search: Traversing top-to-bottom across the two branches using recursion (inOrder, preOrder, postOrder).
 */
public class BinaryTreeExample {
    private static class Node {
        private int value;
        private Node left, right;

        public Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    private static Node root;

    public void addNode(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        putNode(root, value);
    }

    public void removeNode(int value) {
        if (root == null) {
            return;
        }
        rmNode(root, value);
    }

    public boolean searchNode(int value) {
        if (root == null) {
            return false;
        }
        return findNode(root, value);
    }

    private static void putNode(Node node, int value) {
        // Level Order BFS (Breadth-First Search)
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

    private static void rmNode(Node node, int value) {
        // Level Order BFS (Breadth-First Search)
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
        // Level Order BFS (Breadth-First Search)
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current == delNode) {
                current = null;
                return;
            }
            if (current.left != null) {
                if (current.left == delNode) {
                    current.left = null;
                    return;
                }
                queue.add(current.left);
            }
            if (current.right != null) {
                if (current.right == delNode) {
                    current.right = null;
                    return;
                }
                queue.add(current.right);
            }
        }
    }

    private static boolean findNode(Node node, int value) {
        // Level Order BFS (Breadth-First Search)
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

    public void inOrderTraversal(Node node) {
        if (node != null) {
            // Recursive DFS (Depth-First Search)
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            // Recursive DFS (Depth-First Search)
            System.out.print(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            // Recursive DFS (Depth-First Search)            
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTreeExample bt = new BinaryTreeExample();
        bt.addNode(1);
        bt.addNode(2);
        bt.addNode(3);
        bt.addNode(4);
        bt.addNode(5);
        bt.addNode(6);
        bt.addNode(7);
        System.out.println("Initial tree:");
        bt.inOrderTraversal(root);
        System.out.println();
        System.out.println("Removing 4:");
        bt.removeNode(4);
        bt.inOrderTraversal(root);
        System.out.println();

        System.out.println("Adding 8:");
        bt.addNode(8);
        bt.inOrderTraversal(root);
        System.out.println();

        System.out.println("Searching for 3: " + bt.searchNode(3));
        System.out.println("Searching for 9: " + bt.searchNode(9));
    }
}