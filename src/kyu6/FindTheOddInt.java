package kyu6;
//Given an array of integers, find the one that appears an odd number of times.
//
//There will always be only one integer that appears an odd number of times.
//
//Examples
//[7] should return 7, because it occurs 1 time (which is odd).
//[0] should return 0, because it occurs 1 time (which is odd).
//[1,1,2] should return 2, because it occurs 1 time (which is odd).
//[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {
    public static void main(String[] args) {
        findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5});
        findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5});
        findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5});
        findIt(new int[]{10});
        findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1});
        findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10});

    }


    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(a);
        for (int num : a) {
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
                continue;
            }
            map.put(num, 1);
        }
        int finalKey = a[0];
//        System.out.println(Arrays.toString(a));
//        System.out.println(map);
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if(integerIntegerEntry.getValue()%2 != 0){
                finalKey = integerIntegerEntry.getKey();
                System.out.println(finalKey);
                return finalKey;
            }
        }
        return 1;
    }
}
