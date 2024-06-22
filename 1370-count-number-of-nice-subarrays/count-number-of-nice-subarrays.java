class Solution {
    public int numberOfSubarrays(int[] arr, int k) {

        //it is a subarray question so i ma using sliding window approach
        return atmost(arr,k)-atmost(arr,k-1);
        
    }

    public int atmost(int[] nums,int k){
        int s=0;
        int ans=0;

        for(int i=0,j=0;i<nums.length;i++){
            s+=nums[i]%2;
            while(s>k){
                s-=nums[j++]%2;
            }

            ans+=(i-j+1);

        }

        return ans;
    }
}