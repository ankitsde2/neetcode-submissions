class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // n=rows
        // m= columns
        int n=matrix.length;
        int m=matrix[0].length;
        int lowCol=0;
        int highCol=m-1;
        int lowRow=0;
        int highRow=n-1;
        while(lowCol<=highCol && lowRow<=highRow){
            int midCol=(lowCol+highCol)/2;
            int midRow=(lowRow+highRow)/2;
            if(matrix[midRow][midCol]==target) return true;
            else if(matrix[midRow][midCol]<target){
                int l=midCol+1;
                int r=m-1;
                while(l<=r){
                    int mi=(l+r)/2;
                    if(matrix[midRow][mi]==target) return true;
                    else if(matrix[midRow][mi]<target) l=mi+1;
                    else r=mi-1;
                }
                lowRow=midRow+1;
                lowCol=0;
                highCol=m-1;
            }else{
                int l=0;
                int r=midCol-1;
                while(l<=r){
                    int mi=(l+r)/2;
                    if(matrix[midRow][mi]==target) return true;
                    else if(matrix[midRow][mi]<target) l=mi+1;
                    else r=mi-1;
                }
                highRow=midRow-1;
                lowCol=0;
                highCol=m-1;
            }
        }
        return false;
    }
}
