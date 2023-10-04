package kyu8;

import java.util.Arrays;
//Complete the function which converts a binary number (given as a string) to a decimal number.


//my Solution

public class BinToDecimal {
    public static void main(String[] args) {
        binToDecimal("10000001");

    }
    public static int binToDecimal(String inp){
        String[] integers = inp.split("");
        int result = 0;
        int count = 0;
        for (int i = integers.length - 1 ; i >= 0 ; i--) {
//            System.out.println(integers[i]);
            if(integers[i].equals("1")){
                System.out.println("entered");
                result += Math.pow(2, count);
            }
            count++;
        }
//        System.out.println(result);
//        return Integer.parseInt(inp, 2);


        return result;
    }
}
