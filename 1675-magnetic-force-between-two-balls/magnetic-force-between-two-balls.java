class Solution {
    public int maxDistance(int[] p, int m) {

        Arrays.sort(p);
        int lo=1;

        int hi=(p[p.length-1]-p[0])/(m-1);

        int ans=1;

        while(lo<=hi){
            int mid =lo+(hi-lo)/2;

            if(helper(p,mid,m)){
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }

        return ans;
    }

    public boolean helper(int[] arr,int dist,int m){
        int c=1;
        int last=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-last>=dist){
                c++;
                last = arr[i];
            }

            if(c>=m){
                return true;
            }
        }

        return false;
    }
}