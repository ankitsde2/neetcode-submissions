class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Using Freq array as key
        //  t-> O(n*m), s-> O(n*m)
        Map<String,List<String>> hm= new HashMap<>();
        for(String s: strs){
            int[] freq= new int[26];
            char[] sa=s.toCharArray();
            for(char c:sa){
                freq[c-'a']++;
            }
            String key=Arrays.toString(freq);
            hm.putIfAbsent(key,new ArrayList<>());
            hm.get(key).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
