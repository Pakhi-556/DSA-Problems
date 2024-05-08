class Solution {
    public String[] findRelativeRanks(int[] score) {

     /* int N = score.length;

        // Create a max heap of pairs (score, index)
        PriorityQueue<Pair<Integer, Integer>> heap = new PriorityQueue<>(
                (a, b) -> b.getKey() - a.getKey());
        for (int i = 0; i < N; i++) {
            heap.add(new Pair<>(score[i], i));
        }

        // Assign ranks to athletes
        String[] rank = new String[N];
        int place = 1;
        while (!heap.isEmpty()) {
            Pair<Integer, Integer> pair = heap.poll();
            int originalIndex = pair.getValue();
            if (place == 1) {
                rank[originalIndex] = "Gold Medal";
            } else if (place == 2) {
                rank[originalIndex] = "Silver Medal";
            } else if (place == 3) {
                rank[originalIndex] = "Bronze Medal";
            } else {
                rank[originalIndex] = String.valueOf(place);
            }
            place++;
        }
        return rank;*/

        int n=score.length;
        //create priority queue that store hightest peak value
        PriorityQueue<Pair<Integer, Integer>> q = new PriorityQueue<>(
                (a, b) -> b.getKey() - a.getKey());
        String ans[]=new String[n];
        
        for(int i=0;i<score.length;i++){
            q.add(new Pair(score[i],i));
        }
        int count=1;
        while(!q.isEmpty()){
             Pair<Integer,Integer> curr=q.poll();
             int ori=curr.getValue();

             if(count==1){
                ans[ori]="Gold Medal";
             }

            else if(count==2){
                ans[ori]="Silver Medal";
            }
            else if(count==3){
                 ans[ori]="Bronze Medal";
            }
            else{
                ans[ori]=Integer.toString(count);
            }

            count++;
        }

       return ans;
    }
}