class Solution {
    private int maximum(int[] nums, int l, int r){
        int max=nums[l];
        for(int i=l+1;i<=r;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=l+k-1;
        int[] result=new int[n-k+1];
        int i=0;
        while(r<n){
            result[i]=maximum(nums,l,r);
            l++;
            r++;
            i++;
        }
        return result;
    }
}
