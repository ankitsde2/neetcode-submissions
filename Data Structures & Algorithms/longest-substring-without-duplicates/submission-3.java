class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            boolean[] arr = new boolean[256];
            Arrays.fill(arr, false);
            for (int j = i; j < n; j++) {
                if (arr[s.charAt(j)])
                    break;
                arr[s.charAt(j)] = true;
                maxLen = Math.max(j - i + 1, maxLen);
            }
        }
        return maxLen;
    }
}
