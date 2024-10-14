package Leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem904 {
    //滑动窗口，动态窗口
    public  int totalFruit_AC(int[] fruits) {
        int totol = 0; // 需统计的
        int cate = 0;  // 滑动条件：窗口内的种类数
        int[] nums = new int[fruits.length+10];  // 各类水果的计数
        for(int left=0,right=0; right < fruits.length; right++){
            //  右累加
            if(++nums[ fruits[right] ] == 1) cate++; //  出现新种类，计数累加++
            //  左滑动
            while(cate>2){
                if(--nums[ fruits[left++] ] == 0) cate--;//  计数减少，减空的种类--
            }
            //  统计
            totol = Math.max(totol, right-left+1);
        }
        return totol;
    }
    @Test
    public void test(){
        Assert.assertEquals(3,totalFruit_AC(new int[]{1,2,1}));
    }
}
