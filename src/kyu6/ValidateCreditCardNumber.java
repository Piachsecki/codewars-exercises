package kyu6;


//In this Kata, you will implement the Luhn Algorithm, which is used to help validate credit card numbers.
//
//        Given a positive integer of up to 16 digits,
//        return true if it is a valid credit card number, and false if it is not.
//
//        Here is the algorithm:
//
//        Double every other digit, scanning from right to left, starting from the second digit (from the right).
//
//        Another way to think about it is: if there are an even number of digits,
//        double every other digit starting with the first; if there are an odd number of digits, double every other digit starting with the second:
//
//        1714 ==> [1*, 7, 1*, 4] ==> [2, 7, 2, 4]
//
//        12345 ==> [1, 2*, 3, 4*, 5] ==> [1, 4, 3, 8, 5]
//
//        891 ==> [8, 9*, 1] ==> [8, 18, 1]
//        If a resulting number is greater than 9,
//        replace it with the sum of its own digits (which is the same as subtracting 9 from it):
//
//        [8, 18*, 1] ==> [8, (1+8), 1] ==> [8, 9, 1]
//
//        or:
//
//        [8, 18*, 1] ==> [8, (18-9), 1] ==> [8, 9, 1]
//        Sum all of the final digits:
//
//        [8, 9, 1] ==> 8 + 9 + 1 = 18
//        Finally, take that sum and divide it by 10. If the remainder equals zero, the original credit card number is valid.
//
//        18 (modulus) 10 ==> 8 , which is not equal to 0, so this is not a valid credit card numbe

import java.util.Arrays;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
//        validate("891");
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        validate("1714");
        validate("4111111111111111");


    }


    public static boolean validate(String n){
        String[] split = n.split("");
        int[] ints = Arrays.stream(split)
                .map(Integer::parseInt)
                .mapToInt(x -> x)
                .toArray();
        Integer result = 0;

        if(n.length() % 2 == 0){
            for (int i = 0; i < ints.length; i++) {
                System.out.println(" 0 / 2 == " + 0/2);
                if(i % 2 == 0){
                    ints[i] = ints[i] * 2;
                }
            }
            result = Arrays.stream(ints)
                    .map(x -> {
                                if (x > 9) {
                                    return x - 9;
                                } else {
                                    return x;
                                }
                            }

                    )
                    .sum();


        }else {
            for (int i = 0; i < ints.length; i++) {
                System.out.println(" 0 / 2 != " + 0/2);
                if(i % 2 != 0){
                    ints[i] = ints[i] * 2;
                }
            }
            result = Arrays.stream(ints)
                    .map(x -> {
                                if (x > 9) {
                                    return x = x - 9;
                                } else {
                                    return x;
                                }
                            }

                    )
                    .sum();
        }


        System.out.println(result);
        System.out.println( result % 10 == 0);
        return result % 10 == 0;

    }

}
