class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Revision - 1
        HashMap<String, List<String>> hm = new HashMap<>();

        for (String str : strs) {
            int[] freq= new int[26];
            for(int i=0;i<str.length();i++){
                freq[str.charAt(i)-'a']++;
            }
            String key= Arrays.toString(freq);
            if (!hm.containsKey(key))
                hm.put(key, new ArrayList<>());
            hm.get(key).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
