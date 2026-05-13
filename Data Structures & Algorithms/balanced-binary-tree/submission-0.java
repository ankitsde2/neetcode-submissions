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
    private int findHeight(TreeNode node) {
        if (node == null)
            return 0;
        return 1 + Math.max(findHeight(node.left), findHeight(node.right));
    }
    public boolean isBalanced(TreeNode root) {
        // Brute Force
        if (root == null)
            return true;
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1)
            return false;
        boolean leftPart = isBalanced(root.left);
        boolean rightPart = isBalanced(root.right);

        return leftPart && rightPart;
    }
}
