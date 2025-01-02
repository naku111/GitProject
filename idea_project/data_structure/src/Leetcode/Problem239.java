package Leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Problem239 {
    //双端队列实现单调队列
    //双端队列实现单调队列
    //双端队列实现单调队列
    static class MyQueue{
        Deque<Integer> deque=new LinkedList<>();
        void poll(int val){
            if(!deque.isEmpty()&&val==deque.peek()){
                deque.poll();
            }
        }
        void push(int val){
            while( !deque.isEmpty() &&val>deque.getLast()){
                deque.removeLast();
            }
            deque.add(val);
        }
        int front(){
            return deque.peek();
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==1)
            return nums;
        int[] res =new int[nums.length-k+1];
        int n=0;
        MyQueue queue=new MyQueue();
        for(int i=0;i<k;i++){
            queue.push(nums[i]);
        }
        res[n++]=queue.front();
        for(int i=k;i<nums.length;i++){
            queue.poll(nums[i-k]);
            queue.push(nums[i]);
            res[n++]=queue.front();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.println(Arrays.toString(ints));
    }
}
