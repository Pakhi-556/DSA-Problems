class Solution {
    public int minDifference(int[] nums) {

        int ans=Integer.MAX_VALUE;
        int n= nums.length;
        if(nums.length<=4){
            return 0;
        }

        Arrays.sort(nums);

        for(int i=0;i<4;i++){
            ans=Math.min(ans,nums[n-4+i]-nums[i]);
        }


        return ans;
        
    }
}