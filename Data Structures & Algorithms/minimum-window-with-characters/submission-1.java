class Solution {
    public String minWindow(String s, String t) {
        int ns = s.length();
        int nt = t.length();
        int minLen = Integer.MAX_VALUE;
        int startInd = -1;
        int[] freq= new int[256];
        for(int i=0;i<nt;i++){
            freq[t.charAt(i)]++;
        }
        int l=0;
        int r=0;
        int count=0;
        while(r<ns){
            if(freq[s.charAt(r)]>0) count++;
            while(count==nt){
                int len=r-l+1;
                if(minLen>len){
                    minLen=len;
                    startInd=l;
                }
                freq[s.charAt(l)]++;
                if(freq[s.charAt(l)]>0) count--;
                l++;
            }
            freq[s.charAt(r)]--;
            r++;
        }
        if (startInd == -1)
            return "";
        return s.substring(startInd, minLen + startInd);
    }
}
