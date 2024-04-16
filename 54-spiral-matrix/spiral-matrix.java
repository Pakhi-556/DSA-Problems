class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        /*int sr=0;
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

        return ll;*/

        List<Integer> ll=new ArrayList();

        int t=0;
        int l=0;
        int b=matrix.length-1;
        int r=matrix[0].length-1;

        // for left to right
        while(t<=b && l<=r){
        for(int i=l;i<=r;i++){
            ll.add(matrix[t][i]);
        }
        t++;
        // for top to bottom

        for(int i=t;i<=b;i++){
            ll.add(matrix[i][r]);
        }

        r--;
       
       if(t<=b){
        for(int i=r;i>=l;i--){
            ll.add(matrix[b][i]);
        }
        b--;
       }
       if(l<=r){
         for(int i=b;i>=t;i--){
            ll.add(matrix[i][l]);
         }
         l++;
        }
        }
        
         return ll;

    }
}