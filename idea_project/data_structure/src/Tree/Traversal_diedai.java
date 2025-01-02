package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Traversal_diedai {
    //前序遍历 中左右
    //进栈：中右左 出栈：中左右
    public List<Integer> Traversal(TreeNode root){
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            list.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
        return list;
    }

    //后序遍历 左右中
    //进栈：中左右 出栈：中右左 再反转->左右中
    public List<Integer> Traversal02(TreeNode root){
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            list.add(node.val);
            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }
        }
        Collections.reverse(list);
        return list;
    }

    //中序遍历 左中右
    //进栈顺序：左右
    public List<Integer> Traversal03(TreeNode root){
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while(!stack.isEmpty()||cur!=null){
            if(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            else{
                cur=stack.pop();
                list.add(cur.val);
                cur=cur.right;
            }
        }
        return list;
    }
}
