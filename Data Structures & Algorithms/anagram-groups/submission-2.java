class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm=new HashMap<>();        
        for(String s: strs){
            char[] sa= s.toCharArray();
            Arrays.sort(sa);
            String ss=new String(sa);
            hm.putIfAbsent(ss,new ArrayList<>());
            hm.get(ss).add(s);
        }
        
        return new ArrayList<>(hm.values());
    }
}
