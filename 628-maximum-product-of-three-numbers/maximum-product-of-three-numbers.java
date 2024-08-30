class Solution {
    public int maximumProduct(int[] nums) {

        if(nums.length<3){
            return -1;
        }

        Arrays.sort(nums);
        int n=nums.length;

        int case1=nums[0]*nums[1]*nums[n-1];
        int case2=nums[n-1]*nums[n-2]*nums[n-3];

        return Math.max(case1,case2);
    }
}