class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {


        int answer[][]=new int[m][n];
        if(m*n!=original.length){
            return new int[][]{};
        }
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                answer[i][j]=original[k++];
            }
        
        }

        return answer;
        
    }
}