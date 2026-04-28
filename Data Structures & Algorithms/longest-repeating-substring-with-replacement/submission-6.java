class Solution {
    public int characterReplacement(String s, int k) {
       int n=s.length();
       int maxLen=0;
       int l=0;
       int r=0;
       int[] freq=new int[26];
       int maxFreq=0;
       while(r<n){
            freq[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(r)-'A']);
            if(r-l+1-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                maxFreq=0;
                for(int i=0;i<26;i++){
                    maxFreq=Math.max(maxFreq,freq[i]);
                }
                l++;
            } 
            maxLen=Math.max(r-l+1,maxLen);
            r++;
       }
       return maxLen;
    }
}
