package kyu5;

//Complete the function scramble(str1, str2)
// that returns true if a portion of str1 characters can be rearranged to match str2,
// otherwise returns false.
//
//        Notes:
//
//        Only lower case letters will be used (a-z).
//        No punctuation or digits will be included.
//        Performance needs to be considered.
//        Examples
//        scramble('rkqodlw', 'world') ==> True
//        scramble('cedewaraaossoqqyt', 'codewars') ==> True
//        scramble('katas', 'steak') ==> False


import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world"));
        System.out.println(scramble("cedewaraaossoqqyt", "codewars"));
        System.out.println(scramble("katas", "steak"));
        System.out.println(scramble("scriptjavx", "javascript"));
        System.out.println(scramble("scriptingjava", "javascript"));
        System.out.println(scramble("scriptsjava", "javascripts"));
        System.out.println(scramble("javscripts", "javascript"));
        System.out.println(scramble("aabbcamaomsccdd", "commas"));
        System.out.println(scramble("commas", "commas"));
        System.out.println(scramble("sammoc", "commas"));
    }

    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> word1 = countLetters(str1);
        Map<Character, Integer> word2 = countLetters(str2);

        for (Character c : word2.keySet()) {
            Integer n = word1.get(c);
            if (n == null || n < word2.get(c)) {
                return false;
            }
        }
        return true;

    }

    private static Map<Character, Integer> countLetters(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            Integer n = map.get(c);
            if (n == null) {
                map.put(c, 1);
            } else {
                map.put(c, n + 1);
            }
        }
        return map;
    }


    //First idea if I could download the jar into the project:


//    public static boolean scramble(String str1, String str2) {
//        String[] split1 = str1.split("");
//        String[] split2 = str2.split("");
//        List<String> list1 = List.of(split1).stream().sorted().toList();
//        List<String> list2 = List.of(split2).stream().sorted().toList();
//
//        System.out.println(Objects.equals(list1, list2));
//        return CollectionUtils.isSubCollection(list1, list2);
//    }

}
