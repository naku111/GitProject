package Tree;

public class Traversal_DIGUI {
    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(1,
                new TreeNode(2,new TreeNode(4),new TreeNode(5)),
                new TreeNode(3));
        preOrder(treeNode);
    }
    //先序,中序和后序同理
    public static void preOrder(TreeNode node){
        if (node==null){
            return;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
