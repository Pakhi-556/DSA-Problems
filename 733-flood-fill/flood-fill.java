class Solution {

    public static void dfs(int r,int c,int[][] image,int[][] res,int color,int newcolor){
        int n= image.length;
        int m= image[0].length;
        if(r<0 || r==n || c<0 || c==m || res[r][c]!=color){
            return;
        }
        res[r][c]=newcolor;

         dfs(r-1,c,image,res,color,newcolor);
         dfs(r,c+1,image,res,color,newcolor);
         dfs(r+1,c,image,res,color,newcolor);
         dfs(r,c-1,image,res,color,newcolor);
        /*int n= image.length;
        int m= image[0].length;

        for(int i=0;i<4;i++){
            int nr=r+drow[i];
            int nc=c+dcol[i];

            if(nr>=0 && nr<n && nc>=0 && nc<m && image[nr][nc]==color && res[nr][nc]!=newcolor){
                dfs(nr,nc,image,res,drow,dcol,color,newcolor);
            }
        }*/
    }

    public static void dfsf(int[][] image,int sr,int sc,int newcolor,int[][] res,int color){
        int n=image.length;
        int m=image[0].length;
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        res[sr][sc]=newcolor;
        for(int i=0;i<4;i++){
            int nr=dr[i]+sr;
            int nc=dc[i]+sc;

            if(nr>=0 && nc>=0 && nr<n && nc<m && image[nr][nc]==color && res[nr][nc]!=newcolor){
                
                dfsf(image,nr,nc,newcolor,res,color);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {

        int res[][]=image;
        int color=res[sr][sc];
        
        if(color==newcolor){
            return image;
        }

        /*int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};*/


        //dfs(sr,sc,image,res,drow,dcol,color,newcolor);
        dfsf(image,sr,sc,newcolor,res,color);
        
        return res;
    }
}