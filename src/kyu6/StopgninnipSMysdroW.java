package kyu6;


//Write a function that takes in a string of one or more words,
//        and returns the same string,
//        but with all five or more letter words reversed (Just like the name of this Kata).
//        Strings passed in will consist of only letters and spaces.
//        Spaces will be included only when more than one word is present.
//
//        Examples:
//
//        spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//        spinWords( "This is a test") => returns "This is a test"
//        spinWords( "This is another test" )=> returns "This is rehtona test"

import java.util.Arrays;
import java.util.Comparator;

public class StopgninnipSMysdroW {
    public static void main(String[] args) {
        spinWords( "Hey fellow warriors " );
//        spinWords( "This is a test");
//        spinWords( "This is another test");
        spinWords("Welcome");
    }


    public static String spinWords(String sentence) {
        String[] s = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (String word : s) {
            if(word.length()>= 5){
                result.append(new StringBuilder(word).reverse());
            }else {
                result.append(word);
            }
            if(i == s.length - 1){
                break;
            }

            i++;
            result.append(" ");
        }
        System.out.println(result.toString());
        return result.toString();
    }

}
