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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hm.put(inorder[i], i);
        }
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, hm);
    }
    private TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart,
        int inEnd, Map<Integer, Integer> hm) {
        if (inStart > inEnd || preStart > preEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = hm.get(root.val);
        int numOnLeft = inRoot - inStart;
        root.left =
            build(preorder, preStart + 1, preStart + numOnLeft, inorder, inStart, inRoot - 1, hm);
        root.right =
            build(preorder, preStart + numOnLeft + 1, preEnd, inorder, inRoot + 1, inEnd, hm);
        return root;
    }
}
