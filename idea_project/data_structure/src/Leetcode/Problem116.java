package Leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Problem116 {
    class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
    public Node connect(Node root) {
        Node res=root;
        if(root==null) return res;
        Deque<Node> deque=new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()){
            for(int i=deque.size();i>0;i--){
                Node node=deque.poll();
                if(deque.size()>0){
                    node.next=deque.peek();
                }
                else {
                    node.next=null;
                }
                if(node.left!=null){
                    deque.offer(node.left);
                }
                if(node.right!=null){
                    deque.offer(node.right);
                }
            }
        }
        return res;
    }
}
