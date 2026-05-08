class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] <= nums[i])
                    count++;
                else {
                    result[i] = count+1;
                    break;
                }
            }
        }
        return result;
    }
}
