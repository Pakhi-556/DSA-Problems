class Solution {
    public int totalNQueens(int n) {
      int count=0;
      boolean board[][]=new boolean[n][n];
      

      return helper(0,board);

        
    }

    public int helper(int row,boolean[][] board){
        if(row==board.length){
            return 1;
        }
        int count=0;
        for(int col=0;col<board[0].length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count +=helper(row+1,board);
                board[row][col]=false;
            }
        }

        return count;
    }

    public boolean isSafe(boolean[][] board,int row,int col){

        //for vertical check

        for(int i=0;i<row;i++){
            if(board[i][col]==true){
                return false;
            }
        }

        //left diagonal;
      int ml=Math.min(row,col);
      for(int i=1;i<=ml;i++){
        if(board[row-i][col-i]){
            return false;
        }
      }

      //right diagonal
      int mr =Math.min(row,board.length-col-1);
      for(int i=1;i<=mr;i++){
        if(board[row-i][col+i]){
            return false;
        }
      }

      return true;
    }
}