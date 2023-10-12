package kyu8;
//Write a simple parser that will parse and run Deadfish.
//
//        Deadfish has 4 commands, each 1 character long:
//
//        i increments the value (initially 0)
//        d decrements the value
//        s squares the value
//        o outputs the value into the return array
//        Invalid characters should be ignored.
//
//        Deadfish.parse("iiisdoso") =- new int[] {8, 64};


import java.util.Arrays;

public class DeadFish {

    public static void main(String[] args) {
        parse("iiisdosodddddiso");
    }

    public static int[] parse(String data) {
        String[] split = data.split("");
        System.out.println("split : " + Arrays.toString(split));
        long length = Arrays.stream(split)
                .filter("o"::equals)
                .count();
        int[] result = new int[(int)length];
        System.out.println("result : " + Arrays.toString(result));
        int tempSum = 0;
        int i = 0;
        for (String s : split) {
            switch (s) {
                case "i" -> tempSum += 1;
                case "d" -> tempSum--;
                case "s" -> tempSum = (int) Math.pow(tempSum, 2);
                case "o" -> {
                    result[i] = tempSum;
                    i++;
                }
            }
        }
        return result;

    }

}
