package org.hobbiesofar.BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

class BTTraversal {
    class TreeNode {
        int val;
        Node left, right;
        public Node(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public ArrayList<Integer> inOrderTrtaversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) return new ArrayList<>();
        stack.add(root);
        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.println(current.val);

            if(current.left != null) stack.add(current.left);
            result.add(0, current.val);
            if(current.right != null) stack.add(current.right);

        }
        return result;
    }
}
