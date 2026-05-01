class Solution {
    public String minWindow(String s, String t) {
        int ns = s.length();
        int nt = t.length();
        int minLength = Integer.MAX_VALUE;
        int startInd = -1;
        for (int i = 0; i < ns; i++) {
            int[] freq = new int[256];
            int match = 0;
            for (int k = 0; k < nt; k++) {
                freq[t.charAt(k)]++;
            }
            for (int j = i; j < ns; j++) {
                if (freq[s.charAt(j)] > 0)
                    match++;
                freq[s.charAt(j)]--;
                if (match == nt) {
                    int len = j - i + 1;
                    if (len < minLength) {
                        startInd = i;
                        minLength = len;
                    }
                    break;
                }
            }
        }
        if (startInd == -1)
            return "";
        return s.substring(startInd, minLength + startInd);
    }
}
