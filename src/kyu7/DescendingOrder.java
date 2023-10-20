package kyu7;

//Your task is to make a function that can take any non-negative
// integer as an argument and return it with its digits in descending order. Essentially,
// rearrange the digits to create the highest possible number.
//
//        Examples:
//        Input: 42145 Output: 54421
//
//        Input: 145263 Output: 654321
//
//        Input: 123456789 Output: 987654321

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder {
    public static void main(String[] args) {

    }


    public static int sortDesc(final int num) {
        int[] ints = Arrays.stream(String.valueOf(num).split(""))
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::parseInt)
                .toArray();
        StringBuilder sb = new StringBuilder();
        for (int number : ints) {
            sb.append(number);
        }

        return Integer.parseInt(sb.toString());
    }
}
