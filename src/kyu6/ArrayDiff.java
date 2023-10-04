package kyu6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Your goal in this kata is to implement a difference function,
// which subtracts one list from another and returns the result.
//
//        It should remove all values from list a,
//        which are present in list b keeping their order.
//
//        Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
//        If a value is present in b,
//        all of its occurrences must be removed from the other:
//
//        Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
public class ArrayDiff {
    public static void main(String[] args) {
        arrayDiff(new int[] {1, 2},new int [] {1} );
        arrayDiff(new int[] {1, 2, 2},new int [] {1} );
        arrayDiff(new int[] {1, 2, 2},new int [] {2} );
        arrayDiff(new int[] {1, 2, 2},new int [] {} );
        arrayDiff(new int[] {},new int [] {1, 2} );

    }

    public static int[] arrayDiff(int[] a, int[] b) {
        for (int elementA : a) {

        }


//        int[] finalIntsA = Arrays.stream(a).distinct().toArray();
        int[] finalIntsB = Arrays.stream(b).distinct().toArray();
        int i = 0;
        List<Integer> result = new ArrayList<>();
//        int[] result = new int[a.length];
        if(b.length == 0 ){
            System.out.println(Arrays.toString(a));
            return a;
        }
        if(a.length == 0){
            return a;
        }
        for (int paramOfA : a) {
            for (int paramOfB : finalIntsB) {
                if(paramOfA == paramOfB && !result.contains(paramOfA)){
                    continue;
                }
                result.add(paramOfA);

            }
        }
        int[] ints = result.stream().mapToInt(j -> j).toArray();
        System.out.println(Arrays.toString(ints));
        return ints;
    }


}
