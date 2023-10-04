package kyu7;
//Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
// Jaden is also known for some of his philosophy that he delivers via Twitter.
// When writing on Twitter, he is known for almost always capitalizing every word.
// For simplicity, you'll have to capitalize each word,
// check out how contractions are expected to be in the example below.
//
//        Your task is to convert strings to how they would be written by Jaden Smith.
//        The strings are actual quotes from Jaden Smith,
//        but they are not capitalized in the same way he originally typed them.
//
//        Example:
//
//        Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
//        Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
//        Note that the Java version expects a return value of null for an empty string or null.

import java.util.Arrays;
import java.util.Objects;

public class JadenCasingString {
    public static void main(String[] args) {
        String most_trees_are_blue = new JadenCasingString().toJadenCase("most trees are blue");
        System.out.println(most_trees_are_blue);
    }

    public String toJadenCase(String phrase) {
        if(Objects.isNull(phrase)|| "".equals(phrase)){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] words = phrase.split(" ");
        int i = 0;
        for (String word : words) {
            String s = word.substring(0, 1).toUpperCase();
            words[i] = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

            if(i == word.length() ){
                sb.append(words[i]);
                continue;
            }
            sb.append(words[i]).append(" ");
            i++;
        }
        System.out.println(Arrays.toString(words));
        return sb.toString();
    }
}
