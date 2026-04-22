class Solution {
    public int[] productExceptSelf(int[] nums) {
        //  Using Division
        // t-> O(n), s-> O(1)
        int n = nums.length;
        int product = 1;
        int zeroCount = 0;
        int zeroIndex = -1;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                zeroIndex = i;
            }
        }
        if (zeroCount > 1)
            return result;
        for (int num : nums) {
            if (num == 0)
                continue;
            product *= num;
        }
        if (zeroCount == 1) {
            result[zeroIndex] = product;
            return result;
        }
        for (int i = 0; i < n; i++) {
            result[i] = product/nums[i];
        }
        return result;
    }
}
