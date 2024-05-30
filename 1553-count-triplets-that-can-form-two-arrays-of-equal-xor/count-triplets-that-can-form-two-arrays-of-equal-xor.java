class Solution {
    public int countTriplets(int[] arr) {

        int count=0;

        int n=arr.length;

        for(int i=0;i<n;i++){
            int xor=arr[i];
            for(int j=i+1;j<n;j++){
                xor^=arr[j];

                if(xor==0){
                    count+=j-i;
                }
            }
        }

        return count;
    }
}