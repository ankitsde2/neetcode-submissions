class Solution {
    public int[] productExceptSelf(int[] nums) {
        //  Using Pre and Post Post product
        //  t-> O(n), s-> O(n)
        int n=nums.length;
        int[] suffix=new int[n];
        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        int currentProduct=1;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=currentProduct*suffix[i];
            currentProduct*=nums[i];
        }
        return result;
    }
}
