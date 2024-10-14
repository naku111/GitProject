package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Problem977 {
    //从两边往中间走，双指针
    public static int[] sortedSquares(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int[] result = new int[nums.length];
        int index = result.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                // 正数的相对位置是不变的， 需要调整的是负数平方后的相对位置
                result[index--] = nums[left] * nums[left];
                ++left;
            } else {
                result[index--] = nums[right] * nums[right];
                --right;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = sortedSquares(new int[]{-4, -1, 0, 3, 10});
        System.out.println(Arrays.toString(ints));
    }
}
