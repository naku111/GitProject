package Leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Problem209 {
    //滑动窗口,动态窗口
    //j为窗口的右下标，满足条件后，开始移动左下标。
    public static int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int sum=0;
        Integer result=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(sum>=target){
                while(sum>=target){
                    result=Math.min(result,j-i+1);
                    sum-=nums[i++];
                }
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
    @Test
    public void test(){
        Assert.assertEquals(2,minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
}
