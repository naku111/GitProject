package Leetcode;

import java.util.Arrays;

public class Test {
    public static double averageAfterRemovingMinMax(int[] nums) {
        if (nums.length <= 2) {
            throw new IllegalArgumentException("Array must have more than two elements.");
        }
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        int sum=0;
        // 找到最大值和最小值
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=nums[i]<=max ? nums[i]:max;
            min=nums[i]>=min ? nums[i]:min;
        }
        return Math.round((double) (sum - max - min) / (nums.length - 2) * 100.0) / 100.0;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        double result = averageAfterRemovingMinMax(nums);
        System.out.printf("%.2f%n", result);  // 输出: 5.00
    }
}
