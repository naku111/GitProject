package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

import java.util.ArrayList;

public class Problem225 {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    public Problem225() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }

    public void push(int x) {
        q2.offer(x);
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        Queue temp=q2;
        q2=q1;
        q1=temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
