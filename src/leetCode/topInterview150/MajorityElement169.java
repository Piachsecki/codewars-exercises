package leetCode.topInterview150;

//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than n / 2 times. You may assume that the majority element always exists in the array.
//
//
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
//
//
//Constraints:
//
//n == nums.length
//1 <= n <= 5 * 104
//-109 <= nums[i] <= 109
//
//
//Follow-up: Could you solve the problem in linear time and in O(1) space?

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }


    public static int majorityElement(int[] nums) {
        int[] ints = Arrays.stream(nums)
                .distinct()
                .toArray();

        Map<Integer, Integer> map = new HashMap<>();
        for (int anInt : ints) {
            map.put(anInt, 0);
        }

        for (int i = 0 ; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.replace(nums[i],map.get(nums[i])+1);
            }
        }
        int max = 0;
        int result = 0;
        for (Integer integer : map.keySet()) {
            if(map.get(integer) > max){
                max = map.get(integer);
                result = integer;
            }
        }
        return result;
    }
}
