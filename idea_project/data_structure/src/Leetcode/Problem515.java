package Leetcode;

import Tree.TreeNode;

import java.util.*;

public class Problem515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Deque<TreeNode> d = new ArrayDeque<>();
        d.addLast(root);
        while (!d.isEmpty()) {
            int sz = d.size(), max = d.peek().val;
            while (sz-- > 0) {
                TreeNode node = d.pollFirst();
                max = Math.max(max, node.val);
                if (node.left != null) d.addLast(node.left);
                if (node.right != null) d.addLast(node.right);
            }
            ans.add(max);
        }
        return ans;
    }
}
