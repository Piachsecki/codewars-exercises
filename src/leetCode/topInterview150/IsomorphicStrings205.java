package leetCode.topInterview150;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings205 {
//    Given two strings s and t, determine if they are isomorphic.
//
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//All occurrences of a character must be replaced with another character while preserving
// the order of characters. No two characters may map to the same character,
// but a character may map to itself.
//
//
//
//Example 1:
//
//Input: s = "egg", t = "add"
//Output: true
//Example 2:
//
//Input: s = "foo", t = "bar"
//Output: false
//Example 3:
//
//Input: s = "paper", t = "title"
//Output: true
//
//
//Constraints:
//
//1 <= s.length <= 5 * 104
//t.length == s.length
//s and t consist of any valid ascii character.
    public static void main(String[] args) {
//        System.out.println(isIsomorphic("egg", "add"));
//        System.out.println(isIsomorphic("foo", "bar"));
//        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
    }


    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character, Character> charMappingMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if(!charMappingMap.containsKey(original)){
                if (!charMappingMap.containsValue(replacement)){
                    charMappingMap.put(original, replacement);
                }else {
                    return false;
                }
            }else{
                char mappedChar = charMappingMap.get(original);
                if(mappedChar != replacement){
                    return false;
                }
            }

        }
        return true;

    }



    /*
    WRONG APPROACH
    WRONG APPROACH
    WRONG APPROACH
    WRONG APPROACH

     public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> firstWord = extracted(s);

        Map<Character, Integer> secondWord = extracted(t);
        Collection<Integer> from1stWord = firstWord.values();
        System.out.println(from1stWord);
        Collection<Integer> from2ndWord = secondWord.values();
        System.out.println(from2ndWord);
        for (Integer integer : from1stWord) {
            if(from2ndWord.contains(integer)){
                from2ndWord.remove(integer);
            }
        }
        System.out.println(from2ndWord);
//        return from2ndWord.equals(from1stWord) ;
        return from2ndWord.isEmpty();
    }

    private static Map<Character, Integer> extracted(String t) {
        char[] chars2 = t.toCharArray();
        Map<Character, Integer> secondWord = new HashMap<>();
        for (char aChar : chars2) {
            if (secondWord.containsKey(aChar)) {
                secondWord.replace(aChar, secondWord.get(aChar) + 1);
                continue;
            }
            secondWord.put(aChar, 1);
        }
        return secondWord;
    }
     */
}
