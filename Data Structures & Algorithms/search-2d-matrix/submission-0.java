class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int start=matrix[i][0],  end=matrix[i][matrix[i].length-1];
            if(target>=start&& target<=end) {
                int low=0,high=matrix[i].length-1;
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(matrix[i][mid]==target) return true;
                    else if(matrix[i][mid]>target) high=mid-1;
                    else low=mid+1;
                }
                return false;

            }
           
        }
        return false;
        
    }
}