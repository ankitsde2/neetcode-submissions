class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Using 2 pointer and 2D sorting
        // t-> 
        int n=nums.length;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=arr[left][0]+arr[right][0];
            if(sum==target){
                if(arr[left][1]<arr[right][1]){
                    return new int[]{arr[left][1],arr[right][1]};
                }else{
                    return new int[]{arr[right][1],arr[left][1]};
                }
            }
            else if(sum<target) left++;
            else right--;
        }
        return new int[]{-1,-1};
    }
}
