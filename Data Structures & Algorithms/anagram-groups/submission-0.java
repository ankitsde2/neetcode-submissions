class Solution {
    private boolean isAnagram(String s, String t){
        int ns=s.length();
        int ts=t.length();
        if(ns!=ts) return false;
        int[] freq= new int[26];
        for(int i=0;i<ns;i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0) return false; 
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        // Brute Force
        // t->
        int n=strs.length;
        boolean[] included= new boolean[n];
        List<List<String>> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(included[i]) continue;
            included[i]=true;
            List<String> anagram= new ArrayList<>();
            anagram.add(strs[i]);
            for(int j=i+1;j<n;j++){
                if(included[j]) continue;
                if(isAnagram(strs[i],strs[j])){
                    anagram.add(strs[j]);
                    included[j]=true;
                }
            }
            result.add(anagram);
        }
        return result;
    }
}
