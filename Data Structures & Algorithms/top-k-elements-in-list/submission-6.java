class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Revision - 1
        int n=nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        List<Integer>[] buckets= new ArrayList[n+1];
        for(int i=0;i<n+1;i++){
            buckets[i]= new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }
        int index=0;
        int[] result= new int[k];
        for(int i=n;i>=0 && index<k;i--){
            for(int num: buckets[i]){
                if(index==k) break;
                result[index]=num;
                index++;
            }
        }
        return result;
    }
}
