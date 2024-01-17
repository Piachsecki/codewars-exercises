package kyu6;

//A pangram is a sentence that contains every single letter of the alphabet at least once.
// For example,
// the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
// because it uses the letters A-Z at least once (case is irrelevant).
//
//        Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.


import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class DetectPangram {
    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
//        System.out.println(check());
    }

    public static boolean check(String sentence) {
        Set<Integer> charsAsInts = Arrays.stream(sentence.toLowerCase().chars().toArray())
                .boxed()
                .collect(Collectors.toSet());
        int sum = 0;
        for (Integer charsAsInt : charsAsInts) {
            if (charsAsInt >= 97 && charsAsInt <= 122) {
                sum++;
            }
        }

        return sum >= 26;
    }
}
