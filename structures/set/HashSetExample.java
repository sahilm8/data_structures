package structures.set;

import java.util.HashSet;

/*
 * A collection that stores unique elements in no particular order.
 * It offers constant-time complexity O(1) for basic operations and
 * uses hash tables internally for storage.
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
    
        hashSet.add(100);
        hashSet.add(-50);
        hashSet.add(75);
        hashSet.add(200);
        hashSet.add(-150);
        hashSet.add(25);
        hashSet.add(-25);
        hashSet.add(300);
        System.out.println("hashSet: " + hashSet);

        hashSet.remove(-25);
        System.out.println("After removal (-25): " + hashSet);

        System.out.println("Contains 300: " + hashSet.contains(300));
    }
}