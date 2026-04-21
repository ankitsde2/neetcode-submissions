class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Using bucket sort 
        // t-> O(n), s-> O(n) 
       int n=nums.length;
       Map<Integer, Integer> hm= new HashMap<>();
       for(Integer num: nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
       } 
       List<Integer>[] buckets = new List[n+1];
       for(int i=0;i<n+1;i++){
            buckets[i]=new ArrayList<>();
       }
       for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
       }
       int[] result= new int[k];
       int index=0;
       for(int i=n;i>=0 && index<k;i--){
            for(int num: buckets[i]){
                result[index]=num;
                index++;
                if(index==k) return result;
            }
       }
       return result;
       
    }
}
