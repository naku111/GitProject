package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem01 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int balance = target - nums[i];  // 记录当前的目标值的余数
            if(indexMap.containsKey(balance)){  // 查找当前的map中是否有满足要求的值
                return new int []{i, indexMap.get(balance)}; //  如果有，返回目标值
            } else{
                indexMap.put(nums[i], i); //  如果没有，把访问过的元素和下标加入map中
            }
        }
        return null;
    }
}
