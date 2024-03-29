class Solution {
    public long countSubarrays(int[] nums, int k) {
        long max=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }

        long i=0;
        long j=0;
        long count=0;
        long ans=0;

        while(j<nums.length || i>j){
            if(nums[(int)j]==max){
                 count++;
            }

            while(count>=k){
                if(nums[(int)i]==max){
                    count--;
                }
                i++;
                ans+=nums.length-j;
            }

            j++;
           
        }

        


        return ans;
        
    }
}