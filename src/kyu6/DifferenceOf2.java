package kyu6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DifferenceOf2 {
    //The objective is to return all pairs of integers from a given array of integers that have a difference of 2.
    //
    //The result array should be sorted in ascending order of values.
    //
    //Assume there are no duplicate integers in the array. The order of the integers in the input array should not matter.
    //
    //Examples
    //[1, 2, 3, 4]  should return [[1, 3], [2, 4]]
    //
    //[4, 1, 2, 3]  should also return [[1, 3], [2, 4]]
    //
    //[1, 23, 3, 4, 7] should return [[1, 3]]
    //
    //[4, 3, 1, 5, 6] should return [[1, 3], [3, 5], [4, 6]]


    public static void main(String[] args) {

    }


    public static int[][] twosDifference(int[] array) {
        Arrays.sort(array);
        final List<int[]> result = new LinkedList<>();

        for (int number : array) {
            int search = number + 2;
            if(Arrays.binarySearch(array, search) >= 0){
                result.add(new int[]{number, search});
            }
        }

        return result.toArray(new int[][]{});
    }
    public static int[][] twosDifference2(int[] array) {
        Set<Integer> set = Arrays.stream(array).boxed().collect(Collectors.toSet());
        return Arrays.stream(array).boxed().filter(x -> set.contains(x + 2)).sorted().map(x -> new int[]{x, x+2}).toArray(int[][]::new);
    }



}
