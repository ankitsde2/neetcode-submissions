class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> hs = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (hs.contains(s.charAt(j))) break;
                hs.add(s.charAt(j));
            }
            maxLen = Math.max(hs.size(), maxLen);
        }
        return maxLen;
    }
}
