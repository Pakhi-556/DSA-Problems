class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> map=new ArrayList();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }

        for(int i=nums.length-1;i>=0;i--){
            if(map.contains(-nums[i])){
                return nums[i];
            }
        }

        return -1;
    }
}