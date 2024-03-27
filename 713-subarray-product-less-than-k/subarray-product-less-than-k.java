class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;

        /*for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=i;j<nums.length;j++){
               p*=nums[j];
               if(p<k){
                count++;
               }
            }
        }*/

        int i=0;
        int j=0;
        int p=1;  
        while(j<nums.length){
            p*=nums[j++];
            while(i<j && p>=k){
                p/=nums[i++];
            }
            if(p<k){
                count+=j-i;
            }

        }

        return count;
    }
}