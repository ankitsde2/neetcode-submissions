class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n;j++){
                int area=Math.min(heights[i],heights[j])*(j-i);
                maxArea=Math.max(area,maxArea);
            }
        }
        return maxArea;
    }
}
