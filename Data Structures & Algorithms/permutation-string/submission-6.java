class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n2<n1) return false;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<n1;i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        int l=0;
        int r=l+n1-1;
        while(r<n2){
            if(Arrays.equals(freq1,freq2)) return true;
            else{
                freq2[s2.charAt(l)-'a']--;
                l++;
                r++;
                if(r<n2) freq2[s2.charAt(r)-'a']++;
            }
        }
        return false;
    }
}
