package org.hobbiesofar.BinaryTree;

import java.util.List;

class InorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursiveInOrderTraversal(root, result);
        return result;
    }
    private void recursiveInorder(TreeNode root, List<Integer> result) {
        if(root == null) return;
        recursiveInorder(root.left, result);
        result.add(root.val);
        recursiveInorder(root.right, result);
    }

}
