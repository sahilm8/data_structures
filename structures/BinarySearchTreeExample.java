package structures;

/*
 * BSTs provide efficient operations for insertion, deletion, and searching,
 * typically with an average time complexity of O(log n) for balanced trees.
 * The left subtree contains values less than the root, while the right subtree
 * contains values greater than the root. In-order traversal visits the nodes
 * in an ascending order making it useful for applications requiring ordered
 * data processing.
 */
public class BinarySearchTreeExample {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    Node node;

    // add a value
    void add(int value) {
        node = addValue(node, value);
    }

    // remove a value
    void remove(int value) {
        node = removeValue(node, value);
    }

    // search for a value
    boolean search(int value) {
        return searchValue(node, value);
    }

    Node addValue(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        } else if (value < node.value) {
            node.left = addValue(node.left, value);
        } else if (value > node.value) {
            node.right = addValue(node.right, value);
        }
        return node;
    }

    Node removeValue(Node node, int value) {
        if (node == null) {
            return null;
        } else if (value < node.value) {
            node.left = removeValue(node.left, value);
        } else if (value > node.value) {
            node.right = removeValue(node.right, value);
            // no children
        } else if (node.left == null && node.right == null) {
            return null;
            // no left child
        } else if (node.left == null) {
            return node.right;
            // no right child
        } else if (node.right == null) {
            return node.left;
        } else {
            // two children
            // find the minimum value
            // i.e. in-order successor: smallest value larger than the current node
            // always found in the right subtree for a BST
            Node minNode = findMin(node.right);
            // replace the value of the node to be deleted with the in-order successor
            node.value = minNode.value;
            // recursively remove the in-order successor from the right subtree
            node.right = removeValue(node.right, minNode.value);
        }
        return node;
    }

    Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    boolean searchValue(Node node, int value) {
        if (node == null) {
            return false;
        } else if (value < node.value) {
            return searchValue(node.left, value);
        } else if (value > node.value) {
            return searchValue(node.right, value);
        } else {
            value = node.value;
            return true;
        }
    }

    // In-order traversal (left, root, right)
    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.value + " ");
            traverseInOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTreeExample bst = new BinarySearchTreeExample();
        bst.add(6);
        bst.add(4);
        bst.add(8);
        bst.add(3);
        bst.add(5);
        bst.add(7);
        bst.add(9);

        System.out.println("Initial tree: ");
        bst.traverseInOrder(bst.node);
        System.out.println();

        System.out.println("Add value 10: ");
        bst.add(10);
        bst.traverseInOrder(bst.node);
        System.out.println();

        System.out.println("Remove value 4: ");
        bst.remove(4);
        bst.traverseInOrder(bst.node);
        System.out.println();

        System.out.println("Search for value 7: " + bst.search(7));
        System.out.println();

        System.out.print("In-order traversal: ");
        bst.traverseInOrder(bst.node);
        System.out.println();
    }
}
