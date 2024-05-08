package kyu6;

import java.util.*;

public class RomanNumberalsEncoder {

    //Create a function taking a positive integer between 1 and 3999
    // (both included) as its parameter and returning a string
    // containing the Roman Numeral representation of that integer.
    //
    //Modern Roman numerals are written by expressing each digit separately
    // starting with the leftmost digit and skipping any digit with a value
    // of zero. There cannot be more than 3 identical symbols in a row.
    //
    //In Roman numerals:
    //
    //1990 is rendered: 1000=M + 900=CM + 90=XC; resulting in MCMXC.
    //2008 is written as 2000=MM, 8=VIII; or MMVIII.
    //1666 uses each Roman symbol in descending order: MDCLXVI.
    //Example:
    //
    //   1 -->       "I"
    //1000 -->       "M"
    //1666 --> "MDCLXVI"
    //Help:
    //
    //Symbol    Value
    //I          1
    //V          5
    //X          10
    //L          50
    //C          100
    //D          500
    //M          1,000
    public static void main(String[] args) {
//        System.out.println(solution("MCMXC"));
//        System.out.println(solution("MMVIII"));
//        System.out.println(solution("MDCLXVI"));
        secondSide(1749);
    }

    public static int solution(String word) {
        List<String> alphabet = Arrays.stream("MDCLXVI".split("")).toList();
        int[] weight = new int[]{1000, 500, 100, 50, 10, 5, 1};
        String[] splittedword = word.split("");
        int result = weight[alphabet.indexOf(splittedword[splittedword.length - 1])];
        for (int i = splittedword.length - 2; i >= 0 ; i--) {
            if(alphabet.indexOf(splittedword[i]) <= alphabet.indexOf(splittedword[i + 1])){
                result+=weight[alphabet.indexOf(splittedword[i])];
            }else {
                result-=weight[alphabet.indexOf(splittedword[i])];
            }
        }
        return result;
    }


    public static String secondSide(int number){

        Stack<String> stack = new Stack<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("D", 500);
        map.put("C", 100);
        map.put("L", 50);
        map.put("X", 10);
        map.put("V", 5);
        map.put("I", 1);

        for (int i = 10; i < number; i*=10) {
            System.out.println(number % i);
        }
        return "";
    }

}


