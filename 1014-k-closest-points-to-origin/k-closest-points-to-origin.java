class Solution {

    class Node{
        int x;
        int y;
        int dis;

        public Node(int x,int y,int dis){
            this.x=x;
            this.y=y;
            this.dis=dis;
        }
    }
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)-> a.dis - b.dis);
        for(int i=0;i<points.length;i++){

            int d=points[i][0]*points[i][0]+points[i][1]*points[i][1];

            Node n=new Node(points[i][0],points[i][1],d);
            pq.add(n);

        }
        
        int ans[][]=new int[k][2];

        for(int i=0;i<k;i++){
            Node n=pq.poll();
            ans[i][0]=n.x;
            ans[i][1]=n.y;
        }
      
        return ans;
    }
}