class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Map Sorting and List of Arrays
        // t-> O(nlogn), s-> O(n)
        Map<Integer,Integer> hm= new HashMap<>();
        List<int[]> list = new ArrayList<>();
        for(Integer num:nums){
           hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            list.add(new int[]{entry.getKey(),entry.getValue()});
        }
        list.sort((a, b) -> b[1] - a[1]);
        int[] result = new int[k];
        int j = 0;
        while (j < k) {
            result[j] = list.get(j)[0];
            j++;
        }
        return result;
    }
}
