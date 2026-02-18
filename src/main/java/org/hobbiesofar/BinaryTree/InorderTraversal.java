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
        List<Integer> result = iterativeInorderTraversal(root);
        // recursiveInOrderTraversal(root, result);
        return result;
    }
    private void recursiveInOrderTraversal(TreeNode root, List<Integer> result) {
        if(root == null) return;
        recursiveInOrderTraversal(root.left, result);
        result.add(root.val);
        recursiveInOrderTraversal(root.right, result);
    }

    private List<Integer> iterativeInorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            ans.add(curr.val);
            curr = curr.right;
        }
        return ans;
    }

}
