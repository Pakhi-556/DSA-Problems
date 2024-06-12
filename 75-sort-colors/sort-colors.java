class Solution {
    public void sortColors(int[] nums) {

        //insertion sort;
        /*for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int prev=i-1;

            while(prev>=0 && nums[prev]>curr){
                nums[prev+1]=nums[prev];
                prev--;
            }

            nums[prev+1]=curr;
        }*/

        //using binary search algo 

    int low=0;
     int high = nums.length-1;
     int mid=0;
     while(mid<=high){
         if(nums[mid]==0){
             int temp = nums[mid];
             nums[mid] = nums[low];
             nums[low] = temp;
             low++;  mid++;
         }
         else if(nums[mid]==1){
             mid++;
         }else{
             int temp =nums[mid];
             nums[mid] = nums[high];
             nums[high] = temp;
             high--;
         }
     }   
        
    }
}