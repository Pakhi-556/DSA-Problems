class Solution {
    public void moveZeroes(int[] nums) {
        int ans[] =new int[nums.length];
         int k=0;
        for(int i=0;i<ans.length;i++){
            if(nums[i]!=0){
                ans[k++]=nums[i];
            }

        }

       for(int i=0;i<nums.length;i++){
           nums[i]=ans[i];
       }
        
    }
}