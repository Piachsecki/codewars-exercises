package kyu6;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInYourString {
    public static void main(String[] args) {

        count("abcdsteqwt");
        count("abourgsbfkagh");

        System.out.println();
    }

    //HOW solutions should look like:


    // Ex 1:
    //static Map<Character, Integer> count(String str) {
    //    return str.chars().mapToObj(c -> (char) c).collect(toMap(c -> c, c -> 1, Integer::sum));
    //  }


    //Ex 2:
//    public static Map<Character, Integer> count(String str) {
//        Map<Character, Integer> charMap = new HashMap<>();
//
//        for (Character character : str.toCharArray()) {
//            if (charMap.containsKey(character)) {
//                charMap.put(character, charMap.get(character) + 1);
//            } else {
//                charMap.put(character, 1);
//            }
//        }
//        return charMap;
//    }


    public static Map<Character, Integer> count(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            for (int j = 97; j <= 172; j++) {
                if (chars[i] == (char) j && !result.containsKey((char) j)) {
                    for (int k = i + 1; k < chars.length - 1; k++) {
                        if (chars[i] == chars[k]) {
                            count++;
                        }
                    }
                    result.put((char) j, count);
                }


            }
        }
//        System.out.println(result);
        return result;
    }


}
