class Solution {
    public boolean isAnagram(String s, String t) {
        // Using Sorting t--> O(nlogn+mlogm) s--> O(n+nm)
        int ns=s.length();
        int nt=t.length();
        if(ns!=nt) return false;
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        for(int i=0;i<ns;i++){
            if(sc[i]!=tc[i]) return false;
        }
        return true;
    }
}
