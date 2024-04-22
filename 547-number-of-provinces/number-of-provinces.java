class Solution {

    public void dfs(ArrayList<ArrayList<Integer>> adj,int n,int[] vis){
        vis[n]=1;
        for(Integer i: adj.get(n)){
            if(vis[i]==0){
            dfs(adj,i,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList();
        //for converting the matrix into arraylist of list
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int count=0;
        
        int vis[]=new int[isConnected.length];
        for(int i=0;i<vis.length;i++){
            if(vis[i]==0){
              count++;
              dfs(adj,i,vis);
            }
        }
      return count;
    }
}