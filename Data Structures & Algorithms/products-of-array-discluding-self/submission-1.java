class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Brute Force
        // t-> O(n^2), s-> O(1)
        int n=nums.length;
        int[] result= new int[n];
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                product*=nums[j];
            }
            result[i]=product;
        }
        return result;
    }
}  
