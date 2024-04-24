package hackerrank.hackerrankInterviewPreparation.day1.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    {
        System.out.println("A");
    }

    static {
        System.out.println("B");
    }

    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );

        List<Integer> collect = list.stream()
                .flatMap(Collection::stream)
                .map(i -> i + 2)
                .collect(Collectors.toList());
        System.out.println(collect);






    }

    public boolean isBig(Integer n ) {
        return n>30;
    }
    public List<Integer> das(List<Integer> nums){
        return nums==null ? null : nums.stream().filter(this::isBig).collect(Collectors.toList());
    }


}
