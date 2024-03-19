package hackerrankInterview.day1.test;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMedian(List.of(0, 1, 2, 4, 6, 5 ,3)));
        System.out.println(findMedian(List.of(1, 2,3 ,4 ,5 )));
    }

    public static int findMedian(List<Integer> arr) {
        int[] ints = arr.stream().mapToInt(Integer::intValue)
                .toArray();
        Arrays.sort(ints);
        return ints[ints.length/2];

    }
}
