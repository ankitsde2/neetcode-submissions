class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new LinkedList<>();
        int[] result = new int[n - k + 1];
        int resultIndex = 0;
        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();
            while (!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1) {
                result[resultIndex++] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}
