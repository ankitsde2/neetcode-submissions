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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        q.offer(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            boolean levelDone = false;
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                if (!levelDone) {
                    result.add(node.val);
                    levelDone = true;
                }
                if (node.right != null)
                    q.offer(node.right);
                if (node.left != null)
                    q.offer(node.left);
            }
        }
        return result;
    }
}
