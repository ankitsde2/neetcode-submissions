class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> hs = new HashSet<>();
            int len = 0;
            for (int j = i; j < n; j++) {
                if (!hs.contains(s.charAt(j))) {
                    len++;
                    hs.add(s.charAt(j));
                } else {
                    maxLen = Math.max(len, maxLen);
                    break;
                }
            }
            maxLen = Math.max(len, maxLen);
        }

        return maxLen;
    }
}
