/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        findHeight(root, diameter);
        return diameter[0];
    }

    private int findHeight(TreeNode node, int[] dia) {
        if (node == null)
            return 0;
        int leftHeight = findHeight(node.left,dia);
        int rightHeight = findHeight(node.right,dia);
        dia[0] = Math.max(dia[0], leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
