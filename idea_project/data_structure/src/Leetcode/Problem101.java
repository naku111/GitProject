package Leetcode;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Problem101 {
    public boolean isSymmetric(TreeNode root) {
        boolean bool=true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int depth=0;
        while (!queue.isEmpty()){
            depth++;
            int c=queue.size();
            int[] nums=new int[(int) Math.pow(2,depth)];
            int n=0;
            for (int i=0;i<c;i++){
                TreeNode node=queue.poll();
                if(node.val==-1000){
                    nums[n]=0;
                    n++;
                }
                nums[n]=node.val;
                n++;
                if(node.left!=null){
                    queue.offer(node.left);
                }else{
                    queue.offer(new TreeNode(-1000));
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }else{
                    queue.offer(new TreeNode(-1000));
                }
            }
            for (int i = 0; i <n/2; i++) {
                if(nums[i]!=nums[n-i-1]){
                    bool=false;
                }
            }
        }
        return bool;
    }
}
