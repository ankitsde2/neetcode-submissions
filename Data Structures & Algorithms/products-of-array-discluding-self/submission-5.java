class Solution {
    public int[] productExceptSelf(int[] nums) {
        //  Using Pre and Post Post product
        //  t-> O(n), s-> O(1)
        int n=nums.length;
        int[] result=new int[n];
        result[n-1]=1;
        for(int i=n-2;i>=0;i--){
            result[i]=result[i+1]*nums[i+1];
        }
        int currentProduct=1;
        for(int i=0;i<n;i++){
            result[i]=currentProduct*result[i];
            currentProduct*=nums[i];
        }
        return result;
    }
}
