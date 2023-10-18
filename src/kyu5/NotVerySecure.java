package kyu5;

import java.util.List;
import java.util.stream.Collectors;

public class NotVerySecure {

//    In this example you have to validate if a user input string is alphanumeric. The given string is not nil/null/NULL/None, so you don't have to check that.
//
//    The string has the following conditions to be alphanumeric:
//
//    At least one character ("" is not valid)
//    Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
//    No whitespaces / underscore

    public static void main(String[] args) {
        alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        alphanumeric("");
        alphanumeric("with space");
        alphanumeric("with_underscore");
        alphanumeric( "punctuation.");
        alphanumeric("naïve");
        alphanumeric("１strangedigit");
        alphanumeric("emoji😊");

    }

    //correct Solution
    public static boolean alphanumericSolution(String string){
        return string.matches("[A-Za-z0-9]+");
    }


    public static boolean alphanumeric(String s) {
        if (s.contains(" ") || s.contains("_") || s.isEmpty()) {
            System.out.println("calling false from the 1st if");
            return false;
        }

        //1st idea - iterate over 3 different ranges in ASCII table

//        for (int i = 48; i <= 122; i++) {
//            //48 - 57
//            //65 - 90
//            //97 - 122
//
//        }


        //2nd idea - Int stream boxed

        List<Integer> collect = s.chars().boxed()
                .filter(x -> {
                            if (
                                    (x >= 0 && x < 48) ||
                                            (x > 57 && x < 65) ||
                                            (x > 90 && x < 97) ||
                                            (x > 122)

                            ) {
                                return true;
                            }
                            return false;
                        }

                ).collect(Collectors.toList());

        System.out.println(collect);

        return collect.isEmpty();
    }

}
