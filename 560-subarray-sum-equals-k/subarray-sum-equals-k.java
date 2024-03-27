class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        
        int s=nums.length;
        for(int i=0;i<s;i++){
                int sum =0;
                sum+=nums[i];
                if(sum==k){
                    count++;
                }
            for(int j=i+1;j<s;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }

            }
        }
        return count;
    }
}