class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Revision - 1
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String str : strs) {
            char[] sa = str.toCharArray();
            Arrays.sort(sa);
            String key = new String(sa);
            if (!hm.containsKey(key))
                hm.put(key, new ArrayList<>());
            hm.get(key).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
