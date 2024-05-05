class Solution {
    public void dfs(int r,int c,int[][] vis,char[][] board){
         vis[r][c]=1;
        int n=board.length;
        int m=board[0].length;
        int[] dr={0,0,1,-1};
        int[] dc={1,-1,0,0};
        
        for(int i=0;i<4;i++){
           int nr=dr[i]+r;
           int nc=dc[i]+c;

           if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && board[nr][nc]=='O'){
            dfs(nr,nc,vis,board);
           }
        }
    }
    public void solve(char[][] b) {
        int n=b.length;
        int m=b[0].length;

        int vis[][]=new int[n][m];

        //for col

        for(int i=0;i<n;i++){
            //first col
            if(b[i][0]=='O' && vis[i][0]==0){
                dfs(i,0,vis,b);
            }

             //last col
            if(b[i][m-1]=='O' && vis[i][m-1]==0){
                dfs(i,m-1,vis,b);
            }
        }


        //for row
        for(int i=0;i<m;i++){
            //first row
            if(b[0][i]=='O' && vis[0][i]==0){
                dfs(0,i,vis,b);
            }

             //last row
            if(b[n-1][i]=='O' && vis[n-1][i]==0){
                dfs(n-1,i,vis,b);
            }
        }


        

for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(vis[i][j]==0 && b[i][j]=='O'){
            b[i][j]='X';
        }
    }
}

        
    }
}