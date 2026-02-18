package org.hobbiesofar.BinaryTree;

import java.util.HashMap;
import java.util.Map;


/*
https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
*/
class ConstructBt {
    class TreeNode {
        int val;
        Node left, right;
        public Node(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private Map<Integer, Integer> inOrderIndexMap = new HashMap<>();
    private int[] preorderArray;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int totalNodes = preorder.length;
        this.preorderArray = preorder;
        for(int i = 0; i < totalNodes; i++) {
            inOrderIndexMap.put(inorder[i], i);
        }

        return dfs(0, 0, totalNodes);
    }

    private TreeNode dfs(int preOrderStartIndex, int inOrderStartIndex, int subTreeSize) {
        if(subTreeSize == 0) return null;
        int rootValue = preorderArray[preOrderStartIndex];
        int rootInorderIndex = inOrderIndexMap.get(rootValue);
        int leftSubtreeSise = rootInorderIndex - inOrderStartIndex;

        TreeNode leftChild = dfs(preOrderStartIndex + 1 , inOrderStartIndex, leftSubtreeSise);

        TreeNode rightChild = dfs(preOrderStartIndex + 1 + leftSubtreeSise, rootInorderIndex + 1, subTreeSize - 1 - leftSubtreeSise);
        return new TreeNode(rootValue, leftChild, rightChild);
    }
}
