class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> row=new ArrayList();
        List<Integer> col=new ArrayList();
        List<Integer> ans=new ArrayList();

        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;

            for(int j=0;j<matrix[0].length;j++){
                min=Math.min(matrix[i][j],min);
            }

            row.add(min);
        }

        for(int i=0;i<matrix[0].length;i++){
            int max=Integer.MIN_VALUE;

            for(int j=0;j<matrix.length;j++){
                max=Math.max(matrix[j][i],max);
            }

            col.add(max);
        }
        

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              if(matrix[i][j]==row.get(i) && matrix[i][j]==col.get(j)){
                      ans.add(matrix[i][j]);
              }
            }

           
        }
        return ans;
    }
}