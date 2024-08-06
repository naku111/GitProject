package Tree;

import java.util.Iterator;

public class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
    public TreeNode(int val){
        this.val=val;
    }
    @Override
    public String toString() {
        return String.valueOf(this.val);
    }
}
