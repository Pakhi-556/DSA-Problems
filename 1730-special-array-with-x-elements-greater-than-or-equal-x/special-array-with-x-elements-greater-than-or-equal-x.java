class Solution {
    public int specialArray(int[] nums) {

        for(int x=0;x<=nums.length;x++){
        int c=0;
           for(int i=0;i<nums.length;i++){
               if(x<=nums[i]){
                c++;
               }
           }

           if(c==x){
            return x;
           }

        }


        return -1;
        
    }
}