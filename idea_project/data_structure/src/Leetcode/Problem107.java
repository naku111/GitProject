package Leetcode;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int num= queue.size();
            while (num>0){
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                num--;
            }
            lists.add(list);
        }
        return lists;
    }
}
