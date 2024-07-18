class KthLargest {

    PriorityQueue<Integer> pq;
    int n;


    public KthLargest(int k, int[] nums) {
        n=k;
        pq=new PriorityQueue();
        for(int i:nums){
            pq.add(i);
        }
        
    }
    
    public int add(int val) {

        pq.offer(val);

        while(pq.size()>n){
            pq.poll();

        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */