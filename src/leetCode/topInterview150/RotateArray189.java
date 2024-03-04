package leetCode.topInterview150;

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
//Example 2:
//
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation:
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]

import java.util.Arrays;

public class RotateArray189 {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
        rotate(new int[]{-1,-100,3,99}, 2);
    }
    public static void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        int i = 0;
        boolean flag = true;
        while (flag){
            if(i+k >= nums.length){
                result[(i+k) - nums.length] = nums[i];
            }else {
                result[i + k] = nums[i];
            }
            if(i== nums.length - 1) {
                flag = false;
            }
            i++;
        }
//        System.arraycopy();
        System.out.println(Arrays.toString(result));
        nums = result;
        System.out.println(Arrays.toString(nums));
    }
}
