package leetCode.topInterview150;

import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {
    public static void main(String[] args) {
        System.out.println( canConstruct("a", "b"));
        System.out.println( canConstruct("aa", "ab"));
        System.out.println( canConstruct("aa", "aab"));
    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = magazine.toCharArray();
        Map<Character, Integer> ourMap = new HashMap<>();
        for (char aChar : chars) {
            if(ourMap.containsKey(aChar)){
                ourMap.replace(aChar, ourMap.get(aChar) + 1);
                continue;
            }
            ourMap.put(aChar, 1);
        }

        char[] finalWordToBeConstructed = ransomNote.toCharArray();
        for (char letter : finalWordToBeConstructed) {
            if(!ourMap.containsKey(letter) || (ourMap.containsKey(letter) && ourMap.get(letter) == 0)){
                return false;
            }
            if (ourMap.containsKey(letter)){
                ourMap.replace(letter, ourMap.get(letter) - 1);
            }
        }

        return true;
    }

}
