package kyu5;

import java.util.*;

//My friend John and I are members of the "Fat to Fit Club (FFC)".
// John is worried because each month a list with the weights
// of members is published and each month he is the last on the list
// which means he is the heaviest.
//
//        I am the one who establishes the list so I told him:
//        "Don't worry any more, I will modify the order of the list".
//        It was decided to attribute a "weight" to numbers.
//        The weight of a number will be from now on the sum of its digits.
//
//        For example 99 will have "weight" 18
//        , 100 will have "weight" 1 so in the list 100 will come before 99.
//
//        Given a string with the weights of FFC members in normal order can
//        you give this string ordered by "weights" of these numbers?
//
//        Example:
//        "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:
//
//        "100 180 90 56 65 74 68 86 99"
//        When two numbers have the same "weight", let us class them as if
//        they were strings (alphabetical ordering) and not numbers:
//
//        180 is before 90 since, having the same "weight" (9),
//        it comes before as a string.
//
//        All numbers in the list are positive numbers and the list can be empty.
//
//        Notes
//        it may happen that the input string have leading, trailing whitespaces and more than a unique whitespace between two consecutive numbers
public class WeightForWeight {
    public static void main(String[] args) {

        System.out.println(orderWeight("103 123 4444 99 2000"));
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
//        System.out.println(orderWeight("103 123 4444 99 2000 222 1203"));
//        System.out.println(orderWeight("103 123 4444 99 2000 222 1203"));


    }

    public static String orderWeight(String strng) {
        String[] ints = strng.split(" ");
        List<Integer> sorted = new ArrayList<>();
        TreeMap<String, Integer> map = new TreeMap<>();


        for (int i = 0; i < ints.length; i++) {
            char[] temp = ints[i].toCharArray();
            int sum = 0;
            for (int j = 0; j < ints[i].length(); j++) {
                sum += Integer.parseInt(temp[j] + "");
            }
//            sorted.add(sum);
//            System.out.println("Number: " +ints[i] + " = " + sum);
            map.put(ints[i], sum);
        }
//        sorted.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });

        List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue().compareTo(o2.getValue()) == 0){
                    return o1.getKey().compareTo(o2.getKey());
                }
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
//        System.out.println(entryList);
        int i =0;
        for (Map.Entry<String, Integer> stringIntegerEntry : entryList) {
            stringBuilder.append(stringIntegerEntry.getKey());
            if(i == entryList.size()){
                continue;
            }
            stringBuilder.append(" ");
            i++;
        }
        return stringBuilder.toString();
    }



}
