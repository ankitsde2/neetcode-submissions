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
    class Pair {
        TreeNode node;
        int maxVal;
        Pair(TreeNode node, int maxVal) {
            this.node = node;
            this.maxVal = maxVal;
        }
    }
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair> q=new ArrayDeque<>();
        int maxValue=Integer.MIN_VALUE;
        q.offer(new Pair(root,maxValue));
        int count=0;
        while(!q.isEmpty()){
            int levelSize=q.size();
            for(int i=0;i<levelSize;i++){
                Pair ele=q.poll();
                TreeNode node= ele.node;
                int maxVal=ele.maxVal;
                if(node.val>=maxVal) count++;
                maxVal=Math.max(maxVal,node.val);
                if(node.left!=null){
                    q.offer(new Pair(node.left,maxVal));
                }
                if(node.right!=null){
                    q.offer(new Pair(node.right,maxVal));;
                }
            }
        }
        return count;
    }
}
