class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Revision 1
        Map<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int required = target - nums[i];
            if (hm.containsKey(required))
                return new int[] {hm.get(required), i};
            hm.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
