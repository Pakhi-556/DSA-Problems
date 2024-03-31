class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int sr=0;
        int sc=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;

        List<Integer> ll= new ArrayList();

        while(sr<=er && sc<=ec){
            //Top
            for(int i=sc;i<=ec;i++){
                ll.add(matrix[sr][i]);
            }
            sr++;

            //right
            for(int i=sr;i<=er;i++){
                ll.add(matrix[i][ec]);
            }
            ec--;

            //bottom
            if(sr<=er){
            for(int i=ec;i>=sc;i--){
                ll.add(matrix[er][i]);
            }
            er--;
            }
            
            //left
            if(sc<=ec){
            for(int i=er;i>=sr;i--){
                ll.add(matrix[i][sc]);
            }
             sc++;
            }

        }

        return ll;
        
    }
}