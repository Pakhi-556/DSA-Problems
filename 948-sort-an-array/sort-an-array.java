class Solution {
    public int[] sortArray(int[] nums) {

        //this questionis solve using count sort algo 
        //find largest num na d smallest number

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;


        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }

        int ans[]=new int[(max-min)+1];
        for(int i=0;i<nums.length;i++){
            ans[nums[i]-min]++;
        }
        int idx=0;
        for(int i=0;i<ans.length;i++){
            int count=ans[i];

            while(count-->0){
                nums[idx++]=min;
            }

            min++;
        }


        return nums;
         
    }
}