class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        boolean board[][]=new boolean[n][n];
        
        helper(0,board,res);
        return res;
        
    }

    public static void helper(int row,boolean board[][],List<List<String>> solutions){
        if(row==board.length){
            solutions.add(display(board));
            return;
        }

        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                helper(row+1,board,solutions);
                //backtracking done
                board[row][col]=false;
            }
        }
    }

    public static boolean isSafe(boolean[][] board,int row,int col){
      //vertical checking
      for(int i=0;i<row;i++){
        if(board[i][col]){
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

    public static ArrayList<String> display(boolean[][] board){
        ArrayList<String> list=new ArrayList<>();
        for(boolean[] arr:board){
            StringBuilder row=new StringBuilder();
            for(boolean num:arr){
                if(num){
                    row.append("Q");
                }else{
                    row.append(".");
                }
            }

            list.add(row.toString());
        }
        return list;
    }
    
}