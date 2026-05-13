class Solution {
    public int[] twoSum(int[] nums, int target) {
        // R1
        int n = nums.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int sum = arr[low][0] + arr[high][0];
            if (sum == target) {
                if (arr[low][1] < arr[high][1])
                    return new int[] {arr[low][1], arr[high][1]};
                return new int[] {arr[high][1], arr[low][1]};
            } else if (sum < target)
                low++;
            else
                high--;
        }
        return new int[] {-1, -1};
    }
}
