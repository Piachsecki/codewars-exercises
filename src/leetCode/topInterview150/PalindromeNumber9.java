package leetCode.topInterview150;

public class PalindromeNumber9 {



    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x)).reverse();
//        System.out.println(sb);
//        System.out.println(x);
        return sb.toString().equals(String.valueOf(x));
    }
}
