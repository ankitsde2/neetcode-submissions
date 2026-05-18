class Solution {
    public boolean canJump(int[] nums) {
        // your code goes here
        int n = nums.length;
        int maxInd = 0;
        int i = 0;
        while (i < n && i <= maxInd) {
            if (i <= maxInd) {
                maxInd = Math.max(nums[i] + i, maxInd);
                i++;
            } else
                break;
        }
        return i == n;
    }
}
