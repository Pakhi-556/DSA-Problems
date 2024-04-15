class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int count[]=new int[2];
        int max=0;
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
              if(mat[i][j]==1){
                c+=1;
              }
            }

            if(c>max){
                count[0]=i;
                count[1]=c;
                max=c;
            }
        }
        return count;
    }
}