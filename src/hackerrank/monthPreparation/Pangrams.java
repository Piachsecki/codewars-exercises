package hackerrank.monthPreparation;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {

    public static void main(String[] args) {

    }

    public static String pangrams(String s) {

        Set<Character> chars = new HashSet<>();

        for(char c : s.toLowerCase().toCharArray()) { // O(n)
            if (c >= 'a' && c <= 'z') {
                chars.add(c);
            }
        }

        return chars.size() == 26 ? "pangram" : "not pangram";
    }



}
