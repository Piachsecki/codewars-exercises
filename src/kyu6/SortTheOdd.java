package kyu6;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

//Task
//        You will be given an array of numbers.
//        You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
//
//        Examples
//        [7, 1]  =>  [1, 7]
//        [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
//        [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
public class SortTheOdd {
    public static void main(String[] args) {
        sortArray(new int[]{5, 8, 6, 3, 4});
        sortArray(new int[]{7, 1});
        sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
    }

    public static int[] sortArray(int[] array) {
        List<Integer> originalArray = Arrays.stream(array)
                .boxed().toList();

        List<Integer> oddNumbers = Arrays.stream(array)
                .boxed()
                .filter(x -> x % 2 != 0)
                .sorted().toList();
        AtomicInteger ordinal = new AtomicInteger(0);
        List<Integer> result = originalArray.stream()
                .map(x -> {
                    if (x % 2 != 0) {
                        x = oddNumbers.get(ordinal.getAndIncrement());
                    }
                    return x;
                }).toList();
        System.out.println(oddNumbers);
        System.out.println(result);

        return result
                .stream()
                .mapToInt(x -> x)
                .toArray();
    }
}
