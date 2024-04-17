class Solution {

    //function for  maximum idex in arr
    public int helper(int[][] mat,int n,int m,int col){
        int max=-1;
        int i=-1;
        for(int j=0;j<n;j++){
            if(mat[j][col]>max){
                max=mat[j][col];
                i=j;
            }
        }

        return i;
    }
    public int[] findPeakGrid(int[][] mat) {

        int n=mat.length;
        int m=mat[0].length;

        int l=0;
        int r=m-1;//for finding column
        int ans[]=new int[2];

        while(l<=r){
            int mid=(l+r)/2;
            int maxind=helper(mat,n,m,mid);
            int left= mid-1>=0 ? mat[maxind][mid-1]:-1;
            int right=mid+1<m ? mat[maxind][mid+1]:-1;

            if(mat[maxind][mid]>left && right<mat[maxind][mid]){
                ans[0]=maxind;
                ans[1]=mid;
                return ans;
            }
            else if(mat[maxind][mid]<left){
                r=mid-1;
            }else{
                l=mid+1;
            }

        }

        return ans;
        
    }
}