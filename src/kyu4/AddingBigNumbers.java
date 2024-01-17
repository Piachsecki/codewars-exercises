package kyu4;


import java.util.Arrays;

//We need to sum big numbers and we require your help.
//
//        Write a function that returns the sum of two numbers. The input numbers are strings and the function must return a string.
//
//        Example
//        add("123", "321"); -> "444"
//        add("11", "99");   -> "110"
//        Notes
//        The input numbers are big.
//        The input is a string of only digits
//        The numbers are positives
public class AddingBigNumbers {

    public static void main(String[] args) {
        System.out.println(add("123443234", "2345"));
    }


    public static String add(String a, String b) {
        String[] char2 = b.split("");
        int[] array1 = Arrays.stream(a.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] array2 = Arrays.stream(b.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        int max = array1.length - array2.length;
        if(max >= 0){
            max = array1.length;
        }else {
            max = array2.length;
        }


        int[] result = new int[max+1];
        int flag1 = array2.length - 1;
        int flag2 = result.length - 1;
        for (int i = max - 1; i >=0; i--) {
            if(flag1 < 0){
                if(array1[i] / 10 !=0){
                    array1[i - 1]+=1;
                    array1[i] = array1[i]-10;
                }
                result[flag2] = array1[i];
                flag2--;
                continue;
            }
            int temp = array1[i] + array2[flag1];
            if(temp/10 != 0){
                array1[i - 1]+=1;
                temp-=10;
            }
            result[flag2] = temp;
            flag1--;
            flag2--;

        }
        StringBuilder sb = new StringBuilder();
        if (result[result.length - 1] != 0){
            for (int i = 1; i < result.length;  i++) {
                sb.append(result[i]);
            }
        }else {
            for (int i = 0; i < result.length;  i++) {
                sb.append(result[i]);
            }
        }


        return sb.toString();
    }

}
