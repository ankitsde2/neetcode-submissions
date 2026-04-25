class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int res=0;
        int left=0;
        int right=n-1;
        int leftMax=0;
        int rightMax=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(leftMax>height[left]){
                    res+=leftMax-height[left];
                }else{
                    leftMax=height[left];
                }
                left++;
            }else{
                if(rightMax>height[right]){
                    res+=rightMax-height[right];
                }else{
                    rightMax=height[right];
                }
                right--;
            }
        }
        return res;
    }
}
