package kyu6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortByFrequency {
    public static void main(String[] args) {

    }


    public static int[] sortByFrequency(int[] array) {
        Map<Integer, Long> collect = Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        return Arrays.stream(array)
                .boxed()
                .sorted(Comparator.<Integer, Long>comparing(collect::get)
                        .reversed()
                        .thenComparing(Comparator.naturalOrder()))
                .mapToInt(Integer::intValue)
                .toArray();

    }
}
