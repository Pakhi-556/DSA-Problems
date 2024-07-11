class Solution {
    public int findTheWinner(int n, int k) {

        if(k==1){
            return n;
        }

        Queue<Integer> q=new LinkedList();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
       
       int i=1;
       while(q.size()!=1){
           while(i!=k){
               q.add(q.remove());
               i++;
           }
           q.remove();
           i=1;
       }

       return q.poll();
    }
}