package structures;

import java.util.LinkedList;
import java.util.Queue;

/*
 * A binary tree is a hierarchical data structure in which each node has at
 * most two children, referred to as the left and right child. It is used to
 * represent hierarchical relationships and can be traversed in various ways
 * (in-order, pre-order, post-order, level-order). Binary trees are foundational for more
 * complex structures like binary search trees and heaps.
 */
public class BinaryTreeExample {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    Node root;

    // add a value
    void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            addValue(root, value);
        }
    }

    // remove a value
    void remove(int value) {
        if (root == null)
            return;
        removeValue(root, value);
    }

    // search for a value
    boolean search(int value) {
        return searchValue(root, value);
    }

    void addValue(Node node, int value) {
        if (node == null) {
            node = new Node(value);
        }
        // level-order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left == null) {
                current.left = new Node(value);
                return;
            } else if (current.right == null) {
                current.right = new Node(value);
                return;
            } else {
                queue.add(current.left);
                queue.add(current.right);
            }
        }
    }

    void removeValue(Node node, int value) {
        if (node == null) {
            return;
        }
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
            deleteDeepest(root, lastNode);
            nodeToRemove.value = lastValue;
        }
    }

    void deleteDeepest(Node root, Node delNode) {
        if (root == null) {
            return;
        }
        // level-order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
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
                } else {
                    queue.add(temp.right);
                }
            }
            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else {
                    queue.add(temp.left);
                }
            }
        }
    }

    boolean searchValue(Node node, int value) {
        if (node == null) {
            return false;
        }
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
    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.value + " ");
            traverseInOrder(node.right);
        }
    }

    // Pre-order traversal (root, left, right)
    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // Post-order traversal (left, right, root)
    void traversePostOrder(Node node) {
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
        bt.traverseInOrder(bt.root);
        System.out.println();

        System.out.println("Removing 3:");
        bt.remove(3);
        bt.traverseInOrder(bt.root);
        System.out.println();

        System.out.println("Adding 8:");
        bt.add(8);
        bt.traverseInOrder(bt.root);
        System.out.println();

        System.out.println("Searching for 5: " + bt.search(5));
        System.out.println("Searching for 9: " + bt.search(9));
    }
}