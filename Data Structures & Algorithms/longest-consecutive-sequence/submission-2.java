class Solution {
    public int longestConsecutive(int[] nums) {
        // Using Set
        // t-> O(n), s->O(n)
        Set<Integer> st = new HashSet<>();
        for (int num : nums) {
            st.add(num);
        }
        int maxLength = 0;
        for (int item : st) {
            if (!st.contains(item - 1)) {
                int length = 1;
                while (st.contains(item + length)) length++;
                maxLength = Math.max(length, maxLength);
            }
        }
        return maxLength;
    }
}
