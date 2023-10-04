package kyu6;

import java.util.HashMap;
import java.util.Map;

//Given a string of words, you need to find the highest scoring word.
//
//        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//        For example, the score of abad is 8 (1 + 2 + 1 + 4).
//
//        You need to return the highest scoring word as a string.
//
//        If two words score the same, return the word that appears earliest in the original string.
//
//        All letters will be lowercase and all inputs will be valid.
public class HighestScoringWord {
    public static void main(String[] args) {
        high("agdfd asdfasd aaas 453");
    }

    public static String high(String s) {
        char c;
        String[] alphabet = new String[26];
        Map<String, Integer> map = new HashMap<>();

        int i = 0;
        for (c = 'a'; c <= 'z'; ++c) {
            alphabet[i] = String.valueOf(c);
            map.put(alphabet[i], ++i);
        }

        String[] words = s.split(" ");
        Integer highestWord = 0;
        String highestCountedWord = new String();
        for (int j =0; j < words.length; j++) {
            char[] chars = words[j].toCharArray();
            int temp = 0;
            for (int k = 0; k < chars.length; k++) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if(entry.getKey().equals(String.valueOf(chars[k]))){
                        temp+= entry.getValue();
//                        System.out.println(String.valueOf(chars[k]) + "temp = " + temp);
                    }
                    if(highestWord < temp){
                        highestWord = temp;
                        highestCountedWord = words[j];
                    }
                }
            }
        }

        System.out.println("highestWord = " + highestWord);
        System.out.println("highestCountedWord = " + highestCountedWord);
        return highestCountedWord;
    }

}
