package Stack;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
/*
* 中缀表达式转为后缀表达式
* 1.遇到非运算符直接拼串
* 2.运算比较优先级：
* 如果比栈顶大，直接进栈；否则，将依次将栈内>=它的直接出栈并拼串，最后进栈
* 3.将栈内剩余运算符依次出栈拼串
* */
public class InfixTosuffix {


    @Test
    public void test(){
        Assert.assertEquals("ab+c-",infixTosuffix("a+b-c"));;
    }

    public static int prior(char c){
        return switch (c){
            case '*','/' -> 2;
            case '-','+' -> 1;
            default -> throw new IllegalArgumentException("不合法的运算符："+c);
        };
    }
    public static String infixTosuffix(String p){
        LinkedList<Character> stack=new LinkedList<>();
        StringBuilder str=new StringBuilder();

        for (int i = 0; i < p.length(); i++) {
            char c=p.charAt(i);
            switch (c){
                case '*','/','+','-'->{
                    if(stack.isEmpty()){
                        stack.push(c);
                    }
                    else {
                        if(prior(c)>prior(stack.peek())){
                            stack.push(c);
                        }
                        else{
                            while (!stack.isEmpty()&&prior(c)<=prior(stack.peek())){
                                str.append(stack.pop());
                            }
                            stack.push(c);
                        }
                    }

                }
                default -> {
                    str.append(c);
                }
            }
        }
        while (!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.toString();
    }
}
