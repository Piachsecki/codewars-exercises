package hackerrankInterview.day1.ex2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        miniMaxSum(List.of(256741038, 623958417, 467905213, 714532089, 938071625));
    }

    public static void miniMaxSum(List<Integer> arr) {
        int[] ints = arr.stream()
                .mapToInt(x -> (Integer) x)
                .toArray();
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        long max = 0L;
        long min = 0L;
        for (int i = 0; i < ints.length - 1; i++) {
            min+=ints[i];
        }
        for (int i = ints.length - 1; i > 0; i--) {
            max+=ints[i];
        }
        System.out.println(min + " " + max);

    }


}
