class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>=0;j--){
                if(nums[j]==-nums[i]){
                    return nums[j];
                }
            }
        }

       
        return -1;
    }
}