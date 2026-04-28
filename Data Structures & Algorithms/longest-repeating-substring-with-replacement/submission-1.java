class Solution {
    public int characterReplacement(String s, int k) {
       int n=s.length();
       int maxLen=0;
       for(int i=0;i<n;i++){
            int[] freq= new int[26];
            int maxFreq=0;
            for(int j=i;j<n;j++){
               freq[s.charAt(j)-'A']++;
               maxFreq=Math.max(freq[s.charAt(j)-'A'],maxFreq);
               if(j-i+1-maxFreq>k) break;
               maxLen=Math.max(j-i+1,maxLen);
            }
       } 
       return maxLen;
    }
}
