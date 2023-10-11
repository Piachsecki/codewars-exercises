package kyu6;

//Digital root is the recursive sum of all the digits in a number.
//
//        Given n, take the sum of the digits of n.
//        If that value has more than one digit,
//        continue reducing in this way until a single-digit number is produced.
//        The input will be a non-negative integer.
//
//        Examples
//        16  -->  1 + 6 = 7
//        942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
//        132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
//        493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digital_root(16));
        System.out.println(digital_root(942));
        System.out.println(digital_root(132189));
        System.out.println(digital_root(493193));


//        digital_root(16);

    }

    public static int digital_root(int n) {
        while(n > 9){
           n = n/10 + n % 10;
        }
        return n;


//        String numberGiven = String.valueOf(n);
//        int sum = Arrays.stream(numberGiven.split(""))
//                .mapToInt(Integer::valueOf)
//                .sum();
//        boolean flag = true;
//
//
//        while(flag){
//            if((int) Math.log10(sum) + 1 != 1) {
//                sum = Arrays.stream(String.valueOf(sum).split(""))
//                        .mapToInt(Integer::valueOf)
//                        .sum();
//            }else {
//                flag = false;
//            }
//        }
























//        List<Integer> list = Arrays.stream(numbersFromTheGivenNumber)
//                .map(Integer::valueOf)
//                .collect(Collectors.toList());
//
//        outerloop:
//        for (int i = 0; i > -1; i++) {
//
//            for (int j = list.size() - 1; j >= 0; j--) {
//                result+=list.get(j);
//                list.remove(j);
//            }
//
//            if((int) (Math.log10(result) + 1) != 1) {
//                String s = String.valueOf(result);
//                String[] split = s.split("");
//                list = Arrays.stream(split)
//                        .map(Integer::valueOf)
//                        .collect(Collectors.toList());
//                result=0;
//                 continue;
//            }else {
//                break outerloop;
//            }
//        }


//        return result;
    }
}
