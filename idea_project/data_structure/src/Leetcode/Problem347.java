package Leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Problem347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int num:nums){
            hashmap.put(num,hashmap.getOrDefault(num,0)+1);
        }
        //默认是小根堆
        PriorityQueue<int []> priorityQueue=new PriorityQueue<>((pair1,pair2)->(pair2[1] - pair1[1]));
//        PriorityQueue<int []> priorityQueue1=new PriorityQueue<>(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o2[1]-o1[1];
//            }
//        });

//        PriorityQueue<Integer> priorityQueue1=new PriorityQueue<>((x,y)->(y-x));//大根堆
//        PriorityQueue<Integer> priorityQueue1=new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;大根堆
//            }
//        })

        for (Map.Entry<Integer,Integer> entry:hashmap.entrySet()){
            priorityQueue.add(new int[]{entry.getKey(),entry.getValue()});
        }
        int[] result=new int[k];
        int i=0;
        for(int l=0;l<k;l++){
            result[i++]=priorityQueue.poll()[0];
        }
        return result;
    }
}
