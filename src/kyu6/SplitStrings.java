package kyu6;

import java.util.Arrays;

//Complete the solution so that it splits the string into pairs of two characters.
// If the string contains an odd number of characters then it should replace
// the missing second character of the final pair with an underscore ('_').
//
//Examples:
//
//* 'abc' =>  ['ab', 'c_']
//* 'abcdef' => ['ab', 'cd', 'ef']
public class SplitStrings {
    public static void main(String[] args) {
        solution("abc");
        solution("abcdef");
    }

    public static String[] solution(String s) {
        //Write your code here
        String[] finalArray = new String[(s.length()+1) / 2];

            int i = 0;
            for (int j = 0; j < s.length(); j+=2) {
                if(j+2 > s.length()){
                    finalArray[i] = s.substring(j)+"_";
                    break;
                }
                finalArray[i] = s.substring(j, j+2);
                i++;
            }



        System.out.println(Arrays.toString(finalArray));


        return finalArray;
    }

}
