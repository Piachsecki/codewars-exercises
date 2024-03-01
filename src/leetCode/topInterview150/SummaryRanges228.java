package leetCode.topInterview150;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]);
        if(nums.length == 0){
            return new ArrayList<>();
        } else if (nums.length == 1) {
            List<String> objects = new ArrayList<>();
            objects.add("" + nums[0]);
            return objects;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sb.append(nums[i]);
            } else {
                if (sb.length() >1) {
                    result.add("" + sb.charAt(0) + "->" + sb.charAt(sb.length() - 1));
                } else {
                    result.add("" + sb.charAt(0));
                }
                sb.delete(0, sb.length());
                sb.append(nums[i]);
            }
            if (i == nums.length - 1) {
                if (sb.length() > 1) {
                    result.add("" + sb.charAt(0) + "->" + sb.charAt(sb.length() - 1));
                } else {
                    result.add("" + sb.charAt(0));
                }
            }
        }

        return result;
    }
}

