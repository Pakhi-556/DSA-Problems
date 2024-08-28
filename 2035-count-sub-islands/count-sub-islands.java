class Solution {
    public void dfs(int[][] grid1, int[][] grid2,int r,int c,boolean[] flag ){
        if(grid1[r][c]==0){
            flag[0]=false;
            return ;
        }
        
        grid2[r][c]=0;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};

        for(int i=0;i<4;i++){
            int nr=dr[i]+r;
            int nc=dc[i]+c;

            if(nr>=0 && nr<grid1.length && nc>=0 && nc<grid1[0].length && grid2[nr][nc]==1){
                dfs(grid1,grid2,nr,nc,flag);
            }
        }
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int r=grid1.length;
        int c=grid1[0].length;

        int sub=0;

        for(int i=0;i<r;i++){
            boolean[] flag={true};
            for(int j=0;j<c;j++){

                if(grid2[i][j]==1){
                    dfs(grid1,grid2,i,j,flag);
                    if(flag[0]){
                        sub++;
                    }
                    flag[0]=true;
                }
                
            }
        }

        return sub;
    }
}