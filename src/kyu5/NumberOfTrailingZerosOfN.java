package kyu5;


//Write a program that will calculate the number of trailing zeros in a factorial of a given number.
//
//        N! = 1 * 2 * 3 *  ... * N
//
//        Be careful 1000! has 2568 digits...
//
//        For more info, see: http://mathworld.wolfram.com/Factorial.html
//
//        Examples
//        zeros(6) = 1
//        # 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero
//
//        zeros(12) = 2
//        # 12! = 479001600 --> 2 trailing zeros
//        Hint: You're not meant to calculate the factorial. Find another way to find the number of zeros.

import java.util.stream.Stream;

public class NumberOfTrailingZerosOfN {
    public static void main(String[] args) {
        zeros(29);
        zeros(30);
        zeros(31);
        zeros(32);
        zeros(33);
        zeros(34);
        zeros(35);
    }


    public static int zeros(int n) {
        //1st idea - calculate the factorial by for loop and then from the foor loop from the end count how many 0 there are

        //2nd
        /*
            0  - 4  0  n / 5
            5  - 9  1
            10 - 14 2
            15 - 19 3
            20 - 24 4
            25 - 29 6
            30 - 34 7
            35 - 39 8 (8*5 - 1)
            40 - 44 9
            45 - 49 10
            50 - 54 12

         */

        return 0;
    }
}
