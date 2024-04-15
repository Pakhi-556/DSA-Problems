class Solution {
    public void setZeroes(int[][] matrix) {

         boolean vis[][]= new boolean[matrix.length][matrix[0].length];
         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j]==0&& vis[i][j]==false){
                    fill(i,j,matrix,vis); 
                 }
             }
         }
        
        
    }

    public void fill(int x,int y,int[][] matrix,boolean[][] vis){

        for(int i=0;i<matrix.length;i++){
            if(matrix[i][y]!=0){
                matrix[i][y]=0;
                vis[i][y]=true;
            }
        }

        
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[x][i]!=0){
                matrix[x][i]=0;
                vis[x][i]=true;
            }
        }

       

    }
}