class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n2 < n1)
            return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < n1; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] == freq2[i])
                matches++;
        }
        int l = 0;
        int r = l + n1 - 1;
        while (r < n2) {
            if (matches == 26)
                return true;
            else {
                // Removing Left
                if (freq1[s2.charAt(l) - 'a'] == freq2[s2.charAt(l) - 'a'])
                    matches--;
                freq2[s2.charAt(l) - 'a']--;
                if (freq1[s2.charAt(l) - 'a'] == freq2[s2.charAt(l) - 'a'])
                        matches++;
                l++;
                // Adding right
                r++;
                if (r < n2) {
                    if (freq1[s2.charAt(r) - 'a'] == freq2[s2.charAt(r) - 'a'])
                        matches--;
                    freq2[s2.charAt(r) - 'a']++;
                    if (freq1[s2.charAt(r) - 'a'] == freq2[s2.charAt(r) - 'a'])
                        matches++;
                }
            }
        }
        return false;
    }
}
