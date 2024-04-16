class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;

        }
        /*int r=matrix.length-1;
        int c=0;

        while(r>=0 && c<=matrix[0].length-1){
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]>target){
                r--;
            }
            else{
                c++;
            }
        }*/

        int n=matrix.length;
        int m=matrix[0].length;

        int i=0;
        int j=n*m-1;

        while(i<=j){
            int mid =(i+j)/2;
            int row=mid/m;
            int col=mid%m;

            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }

        return false;
    }
   
}