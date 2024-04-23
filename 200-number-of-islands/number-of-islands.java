class Solution {
     /*int r;
     int c;
    char arr[][];
    int count;
    public int numIslands(char[][] grid) {
        
       r=grid.length;
       c=grid[0].length;
       arr=grid;
       count=0; 

      for(int i=0;i<r;i++){

          check(arr[i],i);

      }
      return count;
        
    }

    void check(char[] row,int i){
        for(int j=0;j<c;j++){
            if(row[j]=='1'){
                visitIsland(i,j);
                count++;
            }
        }
    }

    public  void visitIsland(int i,int j){
        arr[i][j]='2';
        if(i-1>=0 && arr[i-1][j]=='1'){
            visitIsland(i-1,j);
        }
         if(i+1<r && arr[i+1][j]=='1'){
            visitIsland(i+1,j);
        }
         if(j-1>=0 && arr[i][j-1]=='1'){
            visitIsland(i,j-1);
        }
         if(j+1<c && arr[i][j+1]=='1'){
            visitIsland(i,j+1);
        }
    }*/
  public void dfs(int r,int c,boolean[][] vis,char[][] grid){
    int n= grid.length;
    int m= grid[0].length;
       vis[r][c]=true;
       
       int dr[]={-1,0,1,0};
       int dc[]={0,1,0,-1};

       for(int i=0;i<dr.length;i++){
        int nr=r+dr[i];
        int nc=c+dc[i];

        while(nr>=0 && nr<n && nc>=0 && nc<m && !vis[nr][nc] && grid[nr][nc]=='1'){
            dfs(nr,nc,vis,grid);
        }
       }
  }

  public int numIslands(char[][] grid){

    int n= grid.length;
    int m= grid[0].length;
    boolean[][] vis=new boolean[n][m];
    int count=0;

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if(!vis[i][j] && grid[i][j]=='1'){
            count++;
            dfs(i,j,vis,grid);
          }
        }
    }
   return count;

  } 

}