package kyu6;
//Given two arrays of strings a1 and a2 return a sorted array r in
// lexicographical order of the strings of a1 which are substrings of strings of a2.
//
//        Example 1:
//        a1 = ["arp", "live", "strong"]
//
//        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
//
//        returns ["arp", "live", "strong"]
//
//        Example 2:
//        a1 = ["tarp", "mice", "bull"]
//
//        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
//
//        returns []
//
//        Notes:
//        Arrays are written in "general" notation.
//        See "Your Test Cases" for examples in your language.
//        In Shell bash a1 and a2 are strings.
//        The return is a string where words are separated by commas.
//        Beware: In some languages r must be without duplicates.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class WhichAreIn {
    public static void main(String[] args) {
        System.out.println(Arrays.toString( inArray(new String[]{"arp", "live", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));

    }

    public static String[] inArray(String[] array1, String[] array2) {
        List<String> result = new LinkedList<>();
        for (String s : array2) {
            for (String value : array1) {
                if (s.contains(value)) {
                    if (!result.contains(value)) {
                        result.add(value);
                    }
                }
            }
        }


        return result.stream()
                .sorted()
                .toArray(String[]::new);
    }
}
