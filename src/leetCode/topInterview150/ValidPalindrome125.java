package leetCode.topInterview150;

public class ValidPalindrome125 {


    //A phrase is a palindrome if, after converting all uppercase letters into lowercase
    // letters and removing all non-alphanumeric characters, it reads the same forward and backward.
    // Alphanumeric characters include letters and numbers.
    //
    //Given a string s, return true if it is a palindrome, or false otherwise.
    //
    //
    //
    //Example 1:
    //
    //Input: s = "A man, a plan, a canal: Panama"
    //Output: true
    //Explanation: "amanaplanacanalpanama" is a palindrome.
    //Example 2:
    //
    //Input: s = "race a car"
    //Output: false
    //Explanation: "raceacar" is not a palindrome.
    //Example 3:
    //
    //Input: s = " "
    //Output: true
    //Explanation: s is an empty string "" after removing non-alphanumeric characters.
    //Since an empty string reads the same forward and backward, it is a palindrome.
    public static void main(String[] args) {
//        System.out.println(isPalindrome(" "));
//        System.out.println(isPalindrome("race a car"));
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        StringBuilder originalString = new StringBuilder();
        for (char aChar : chars) {
            if (((int) aChar >= 97 && (int) aChar <= 122) || ((int) aChar >= 48 && (int) aChar <= 57)) {
                originalString.append(aChar);
            }
        }
//        System.out.println(originalString);
//        System.out.println(originalString.reverse());
        return originalString.toString().equals(originalString.reverse().toString());

    }
}
