package Leetcode;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem144 {
    public static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
        public TreeNode(int val){
            this.val=val;
        }
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        bianli(list,root);
        return list;
    }
    public static void bianli(List list,TreeNode node){
        if(node==null) return;
        list.add(node.val);
        bianli(list,node.left);
        bianli(list,node.right);
    }

    public static void main(String[] args) {

    }
}
