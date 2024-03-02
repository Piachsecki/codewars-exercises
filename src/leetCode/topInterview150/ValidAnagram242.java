package leetCode.topInterview150;

import java.util.HashMap;
import java.util.Map;

//Given two strings s and t,
// return true if t is an anagram of s,
// and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.
//
//
//
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false
public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : firstString) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.replace(c, map.get(c) + 1);
            }
        }

        for (char c : secondString) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) - 1);
            } else {
                return false;
            }
        }
        for (Integer value : map.values()) {
            if (value!=0)
                return false;
        }

        return true;
    }
}
