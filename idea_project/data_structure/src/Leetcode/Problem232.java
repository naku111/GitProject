package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Problem232 {
     private Stack<Integer> s1;
    private Stack<Integer> s2;
    //两个栈实现队列
    /*
    * 顶    底
    * s1    s2
    *
    * */
    public Problem232() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public void push(int x) {
        s2.push(x);
    }

    public int pop() {
        if (s1.isEmpty()){
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        return s1.pop();
    }

    public int peek() {
        if (s1.isEmpty()){
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty()||s2.isEmpty();
    }

    @Override
    public String toString() {
        return s1.toString();
    }

    public static void main(String[] args) {
        Problem232 problem232=new Problem232();
        problem232.push(1);
        problem232.push(2);
        problem232.push(3);
        problem232.push(4);
        problem232.pop();
        int peek = problem232.peek();
        System.out.println(problem232);
        System.out.println(peek);
    }
}
