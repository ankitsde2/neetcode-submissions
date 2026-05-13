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
    private void traverse(TreeNode node, List<String> li) {
        if (node == null) {
            li.add("null");
            return;
        }
        li.add(String.valueOf(node.val));
        traverse(node.left, li);
        traverse(node.right, li);
    }
    private List<String> traverseNode(TreeNode root) {
        List<String> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Brute Force
        return traverseNode(p).equals(traverseNode(q));
    }
}
