class Solution {
    public void reverse(int[] arr){
        int s=0;
        int e=arr.length-1;

        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        reverse(happiness);

        int i=0;
        long res=0;

        while(k-->0){
            happiness[i]=Math.max(happiness[i]-i,0);
            res+=happiness[i++];
        }

        return res;
    }
}