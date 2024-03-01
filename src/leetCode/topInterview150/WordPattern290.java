package leetCode.topInterview150;

import java.util.HashMap;
import java.util.Map;

//   Given a pattern and a string s,
//   find if s follows the same pattern.
//
//Here follow means a full match,
// such that there is a bijection between a letter in pattern and a non-empty word in s.
//
//
//
//Example 1:
//
//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true
//Example 2:
//
//Input: pattern = "abba", s = "dog cat cat fish"
//Output: false
//Example 3:
//
//Input: pattern = "aaaa", s = "dog cat cat dog"
//Output: false
//
public class WordPattern290 {


    public static void main(String[] args) {
//        System.out.println(wordPattern("abba","dog cat cat dog"));
//        System.out.println(wordPattern("abba", "dog cat cat fish"));
//        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] split = pattern.split("");
        String[] words = s.split(" ");
        if(split.length!=words.length)
            return false;
        Map<String, String> result = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            if (result.containsKey(split[i])) {
                boolean flag = result.get(split[i]).equals(words[i]);
                if (!flag)
                    return false;
            } else {
                for (String s1 : result.keySet()) {
                    if(result.get(s1).equals(words[i])){
                        return false;
                    }
                }
                result.put(split[i], words[i]);
            }
        }

        return true;
    }
}
