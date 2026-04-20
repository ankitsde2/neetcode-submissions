class Solution {
    public boolean hasDuplicate(int[] nums) {
    //   Using Set 
        int n=nums.length;
        Set<Integer> hs= new HashSet<>();
        for(int i=0;i<n;i++){
            if(hs.contains(nums[i])) return true;
            hs.add(nums[i]);
        }
        return false;
    }
}