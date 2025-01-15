package main.java.data_structures.set;

import java.util.TreeSet;

/*
 * An ordered set backed by a tree structure. It maintains elements
 * in sorted order and provides linear-time complexity log(n)
 * for basic operations.
 */
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(100);
        treeSet.add(-50);
        treeSet.add(75);
        treeSet.add(200);
        treeSet.add(-150);
        treeSet.add(25);
        treeSet.add(-25);
        treeSet.add(300);
        System.out.println("treeSet: " + treeSet);

        treeSet.remove(-25);
        System.out.println("After removal (-25): " + treeSet);

        System.out.println("Contains 300: " + treeSet.contains(300));
    }
}
