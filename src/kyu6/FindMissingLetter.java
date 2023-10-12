package kyu6;

//Find the missing letter
//        Write a method that takes an array of consecutive (increasing)
//        letters as input and that returns the missing letter in the array.
//
//        You will always get an valid array. And it will be always exactly one letter be missing.
//        The length of the array will always be at least 2.
//        The array will always contain letters in only one case.
//
//        Example:
//
//        ['a','b','c','d','f'] -> 'e'
//        ['O','Q','R','S'] -> 'P'
//        (Use the English alphabet with 26 letters!)
//
//        Have fun coding it and please don't forget to vote and rank this kata! :-)
//
//        I have also created other katas. Take a look if you enjoyed this kata!

import java.util.Arrays;

public class FindMissingLetter {

    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[] {'a','b','c','d','f'}));
        System.out.println(findMissingLetter(new char[] {'O','Q','R','S'}));

    }


    public static char findMissingLetter(char[] array) {
        System.out.println(array);

        for (int i = 0; i < array.length; i++) {
            for (int k = 97; k <= 121; k++) {
                int tempI = i + 1;
                int tempK = k + 1;
                if(array[i] == (char)k && array[i+1] != (char) tempK){
//                    System.out.println("array[i] = " + array[i]);
//                    System.out.println("(char)k = " + (char)k);
//                    System.out.println("array[tempI] = " + array[tempI]);
//                    System.out.println("(char) tempK = " + (char) tempK);
                    return (char) tempK;
                }
            }
            for (int k = 65; k <= 89; k++) {
                int tempI = i + 1;
                int tempK = k + 1;
                if(array[i] == (char)k && array[i+1] != (char) tempK){
//                    System.out.println("array[i] = " + array[i]);
//                    System.out.println("(char)k = " + (char)k);
//                    System.out.println("array[tempI] = " + array[tempI]);
//                    System.out.println("(char) tempK = " + (char) tempK);
                    return (char) tempK;
                }
            }

        }


        return ' ';
    }
}
