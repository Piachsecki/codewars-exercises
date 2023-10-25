package kyu5;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Your job is to write a function which increments a string,
// to create a new string.
//
//        If the string already ends with a number,
//        the number should be incremented by 1.
//        If the string does not end with a number.
//        the number 1 should be appended to the new string.
//        Examples:
//
//        foo -> foo1
//
//        foobar23 -> foobar24
//
//        foo0042 -> foo0043
//
//        foo9 -> foo10
//
//        foo099 -> foo100
//
//        Attention:
//        If the number has leading zeros the amount of digits should be considered.
public class StringIncrementer {
    public static void main(String[] args) {
        incrementString("foo");
        incrementString("foo0");
        incrementString("foo09");
        incrementString("foo0043");
    }

    public static String incrementString(String str){
        String u = java.util.regex.Pattern.compile("(\\d+)$").matcher(str).replaceAll(x -> String.format("%0" + x.group().length() +"d", new BigInteger(x.group()).add(BigInteger.ONE)));
        return u.matches(".*(?<!\\d)")?u+1:u;
    }

    //how the solution should look like

//
//
//    public static String incrementString(String str) {
//        Pattern pattern = Pattern.compile("\\d+");
//        Matcher matcher = pattern.matcher(str);
//        StringBuilder result = new StringBuilder();
//        if (matcher.find()){
//
//            String group = matcher.group();
//            int[] ints = Arrays.stream(group.split(""))
//                    .filter(x -> !x.equals("0"))
//                    .mapToInt(Integer::valueOf)
//                    .toArray();
//            String number = "";
//            for (int nums : ints) {
//                number += nums;
//            }
//            Integer integer = Integer.parseInt(number + 1);
//            if(String.valueOf(integer).length() > number.length()){
//
//            }
//            System.out.println(number);
//
//
////            int number = Integer.parseInt(matcher.group());
////            number++;
////            result.append(matcher.replaceFirst(Integer.toString(number)));
//        }else {
//            result.append(str);
//        }
//
//
////        System.out.println("str = " + result);
//        return result.toString(); // you code here
//    }
}
