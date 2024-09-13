package leetCode.easy;

import java.util.HashMap;

public class FirstUniqueCharInAString {
    // T - O(n)
    // S - O(k) (k is number of unique chars)
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharInAString f = new FirstUniqueCharInAString();
        String s = "loveleetcode";
        System.out.println(f.firstUniqChar(s));

    }
}