package leetCode.topInterview150;


public class LongestCommonPrefix14 {
//    Write a function to find the longest common prefix string amongst an array of strings.
//
//    If there is no common prefix, return an empty string "".
//
//
//
//    Example 1:
//
//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"
//    Example 2:
//
//    Input: strs = ["dog","racecar","car"]
//    Output: ""
//    Explanation: There is no common prefix among the input strings.
//
//
//            Constraints:
//
//            1 <= strs.length <= 200
//            0 <= strs[i].length <= 200
//    strs[i] consists of only lowercase English letters.
    public static void main(String[] args) {

    }

    public static String longestCommonPrefix(String[] words) {
        String prefix = words[0];
        for (int i = 1; i < words.length; i++) {
            while(words[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
