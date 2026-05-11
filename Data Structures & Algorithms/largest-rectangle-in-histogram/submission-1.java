class Solution {
    public int largestRectangleArea(int[] nums) {
        int n = nums.length;
        Deque<Integer> st = new ArrayDeque<>();
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                int ind = st.pop();
                int nsei = i;
                int psei = st.isEmpty() ? -1 : st.peek();
                int area = nums[ind] * (nsei - psei - 1);
                maxArea = Math.max(area, maxArea);
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int ind = st.pop();
            int nsei = n;
            int psei = st.isEmpty() ? -1 : st.peek();
            int area = nums[ind] * (nsei - psei - 1);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
