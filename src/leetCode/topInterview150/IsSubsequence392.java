package leetCode.topInterview150;

//Given two strings s and t,
// return true if s is a subsequence of t,
// or false otherwise.
//
//A subsequence of a string is a new string that is formed from
// the original string by deleting some (can be none) of the characters
// without disturbing the relative positions of the remaining characters.
// (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//
//
//
//Example 1:
//
//Input: s = "abc", t = "ahbgdc"
//Output: true
//Example 2:
//
//Input: s = "axc", t = "ahbgdc"
//Output: false
//
//
//Constraints:
//
//0 <= s.length <= 100
//0 <= t.length <= 104
//s and t consist only of lowercase English letters.

public class IsSubsequence392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }


    public static boolean isSubsequence(String s, String t) {
        char[] firstString = s.toCharArray();
        StringBuilder finalResult = new StringBuilder();
        for (char c : firstString) {
            for (int j = 0; j < t.length(); j++) {
                if (c == t.charAt(j)) {
                    finalResult.append(t.charAt(j));
                    t = t.substring(t.indexOf(t.charAt(j)) + 1);
                    break;
                }
            }
        }
        return s.equals(finalResult.toString());

    }
}
