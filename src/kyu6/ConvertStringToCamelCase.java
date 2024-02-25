package kyu6;


import java.util.Arrays;

//Complete the method/function so that it converts dash/underscore delimited words into camel casing.
//        The first word within the output should be capitalized only
//        if the original word was capitalized (known as Upper Camel Case,
//        also often referred to as Pascal case).
//        The next words should be always capitalized.
public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        toCamelCase("the-stealth-warrior");
    }

    static String toCamelCase(String s){
        String[] split = s.split("^[-_]*$");
        System.out.println(Arrays.toString(split));
        return "";
    }
}
