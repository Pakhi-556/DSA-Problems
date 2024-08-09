class Solution {

    public boolean valid(int[][] mat ,int m,int n,int i,int j){
        if(m-i<3 || n-j<3){
            return false;
        }

        Set<Integer> set=new HashSet();
        for(int p=i;p<i+3;p++){
            for(int q=j;q<j+3;q++){
                set.add(mat[p][q]);
            }
        }

        if(set.size()!=9){
            return false;
        }

        for(int p=1;p<=9;p++){
            if(!set.contains(p)){
                return false;
            }
        }

        int row1 = mat[i][j] + mat[i][j + 1] + mat[i][j + 2];
		int row2 = mat[i + 1][j] + mat[i + 1][j + 1] + mat[i + 1][j + 2];
		int row3 = mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2];

		
		if ((row1 != row2) || (row1 != row3)) {
			return false;
		}

		int col1 = mat[i][j] + mat[i + 1][j] + mat[i + 2][j];
		int col2 = mat[i][j + 1] + mat[i + 1][j + 1] + mat[i + 2][j + 1];
		int col3 = mat[i][j + 2] + mat[i + 1][j + 2] + mat[i + 2][j + 2];

		
		if ((col1 != col2) || (col1 != col3) || (row1 != col1)) {
			return false;
		}

        int d1=mat[i][j]+mat[i+1][j+1]+mat[i+2][j+2];
        int d2=mat[i][j+2]+mat[i+1][j+1]+mat[i+2][j];

        if(d1!=d2){
            return false;
        }

        return true;

    }
    public int numMagicSquaresInside(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;

        if(m<3||n<3){
            return 0;
        }

        int ans=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(valid(grid,m,n,i,j)){
                      ans++;
                }
            }
        }

        return ans;
        
    }
}