class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Using HashMap
        // t->
        int n=nums.length;
        Map<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            int required=target-nums[i];
            if(hm.containsKey(required)){
                return new int[]{hm.get(required),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
