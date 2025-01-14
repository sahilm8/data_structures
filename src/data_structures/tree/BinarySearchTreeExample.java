package data_structures.tree;

/*
 * BSTs provide efficient operations for insertion, deletion, and
 * searching, typically with an average time complexity of O(log n) for
 * balanced trees. The left subtree contains values less than the root,
 * while the right subtree contains values greater than the root. Depth-First
 * Search using in-order traversal visits the nodes in an ascending order making
 * it useful for applications requiring ordered data processing.
 */
public class BinarySearchTreeExample {
    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    private static Node root;

    // add a value
    public void add(int value) {
        root = addValue(root, value);
    }

    // remove a value
    public void remove(int value) {
        root = removeValue(root, value);
    }

    // search for a value
    public boolean search(int value) {
        return searchValue(root, value);
    }

    private static Node addValue(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = addValue(node.left, value);
        }
        if (value > node.value) {
            node.right = addValue(node.right, value);
        }
        return node;
    }

    private static Node removeValue(Node node, int value) {
        if (node == null) {
            return null;
        }
        if (value < node.value) {
            node.left = removeValue(node.left, value);
        } else if (value > node.value) {
            node.right = removeValue(node.right, value);
        } else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            // in-order successor: smallest value that is greater than
            // the node (always found in the right subtree)
            Node minNode = findMin(node.right);
            node.value = minNode.value;
            node.right = removeValue(node.right, minNode.value);
        }
        return node;
    }

    private static Node findMin(Node node) {
        if (node.left != null) {
            findMin(node.left);
        }
        return node;
    }

    private static boolean searchValue(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (value == node.value) {
            return true;
        }
        return value < node.value ? searchValue(node.left, value) : searchValue(node.right, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            // Depth-First Search
            traverseInOrder(node.left);
            System.out.print(node.value + " ");
            traverseInOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTreeExample bst = new BinarySearchTreeExample();
        bst.add(4);
        bst.add(6);
        bst.add(1);
        bst.add(3);
        bst.add(5);
        bst.add(7);

        System.out.println("Initial tree: ");
        bst.traverseInOrder(root);
        System.out.println();

        System.out.println("Add value 2: ");
        bst.add(2);
        bst.traverseInOrder(root);
        System.out.println();

        System.out.println("Remove value 1: ");
        bst.remove(1);
        bst.traverseInOrder(root);
        System.out.println();

        System.out.println("Search for value 3: " + bst.search(3));
        System.out.println("Search for value 9: " + bst.search(9));
    }
}
