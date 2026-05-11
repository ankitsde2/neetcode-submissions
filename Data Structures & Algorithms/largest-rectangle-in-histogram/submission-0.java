class Solution {
    private int[] nsei(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        if (n == 0)
            return res;
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            if (!st.isEmpty())
                res[i] = st.peek();
            else
                res[i] = n;
            st.push(i);
        }
        return res;
    }

    private int[] psei(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        if (n == 0)
            return res;
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            if (!st.isEmpty())
                res[i] = st.peek();
            else
                res[i] = -1;
            st.push(i);
        }
        return res;
    }

    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] psei= psei(heights);
        int[] nsei= nsei(heights);
        int maxArea=0;
        for(int i=0;i<n;i++){
            int area=heights[i]*(nsei[i]-psei[i]-1);
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }
}
