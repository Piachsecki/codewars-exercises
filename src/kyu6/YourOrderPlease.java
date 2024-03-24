package kyu6;

//Your task is to sort a given string.
// Each word in the string will contain a single number. This number is the position the word should have in the result.
//
//        Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//        If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
//
//        Examples
//        "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//        "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
//        ""  -->  ""
public class YourOrderPlease {
    public static void main(String[] args) {
//        System.out.println(order("Thi1s is2 3a T4est"));
        System.out.println(order("is2 Thi1s T4est 3a"));
//        System.out.println(order("Fo1r the2 g3ood 4of th5e pe6ople"));
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));

    }

    public static String order(String words) {
        String[] s = words.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j].contains("" + i)) {
                    if(i!=s.length){
                        sb.append(s[j] + " ");
                        break;
                    }else {
                        sb.append(s[j]);
                        break;
                    }
                }
            }
        }
        return sb.toString();
    }


}
