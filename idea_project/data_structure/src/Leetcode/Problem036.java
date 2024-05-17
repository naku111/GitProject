package Leetcode;

import java.util.Stack;

public class Problem036 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> list=new Stack<>();
        for (String t:
             tokens) {
            if(t.equals("+")){
                Integer a=list.pop();
                Integer b=list.pop();
                Integer c=b+a;
                list.push(c);
            }
            else if(t.equals("-")){
                Integer a=list.pop();
                Integer b=list.pop();
                Integer c=b-a;
                list.push(c);
            }
            else if(t.equals("*")){
                Integer a=list.pop();
                Integer b=list.pop();
                Integer c=b*a;
                list.push(c);
            }
            else if(t.equals("/")){
                Integer a=list.pop();
                Integer b=list.pop();
                Integer c=b/a;
                list.push(c);
            }
            else
            {
                list.push(Integer.parseInt(t));
            }
        }
        return list.peek();
    }

    public static void main(String[] args) {
        String[] tokens={"2","1","+","3","*"};
        int a=evalRPN(tokens);
        System.out.println(a);
    }
}
