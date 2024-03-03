package leetCode.topInterview150;

import java.util.Arrays;

public class PlusOne66 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,9})));
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
//        System.out.println(Arrays.toString(digits));
        digits[digits.length- 1] = digits[digits.length- 1] + 1;
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if(digits[i] >= 10 && i !=0){
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
            }
            if(i==0 && digits[i] == 10){
                sb.append(0).append(1);
                break;
            }
            sb.append(digits[i]);

        }
//        System.out.println("digits after: " + Arrays.toString(digits));
//        System.out.println("result: " + sb.toString());
        return sb.length() == 2
                ? Arrays
                .stream(
                        sb.toString()
                                .split("")
                ).mapToInt(
                        Integer::parseInt
                ).toArray()
                : Arrays
                .stream(sb.reverse().toString().split("")).mapToInt(Integer::parseInt).toArray();

    }
}
