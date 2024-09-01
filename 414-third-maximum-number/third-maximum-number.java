class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);
        HashSet<Integer> set= new HashSet();

        for(int i=nums.length-1;i>=0;i--){
            int a=nums[i];
            set.add(nums[i]);
            if(set.size()==3){
                return a;
            }


        }

        return nums[nums.length-1];
        
        
    }
}