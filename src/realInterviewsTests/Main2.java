package realInterviewsTests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
//        System.out.println(maxMagicSums(List.of(3, 4, -6, -10)));
        System.out.println(maxMagicSums(List.of(4, 3, 0, 2, -10)));
    }


    public static int maxMagicSums(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        List<Integer> sorted = arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());


        System.out.println(sorted);
        int i = 0;
        for (Integer integer : sorted) {
            if(i==0){
                i++;
                result.add(integer);
                continue;
            }
            result.add(integer + result.get(i-1));
            i++;
        }
        System.out.println(result);


        int max = 0;
        for (int j = 0; j < result.size(); j++) {
            if(result.get(j) > 0){
                max++;
            }
        }


        return max;
    }

}
