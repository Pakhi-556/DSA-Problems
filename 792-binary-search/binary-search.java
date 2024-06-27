class Solution {
    public int search(int[] nums, int target) {
        return helper(0,nums.length-1,nums,target);
    }

    public static int binarySearch(int nums[],int target,int s,int e){
       
        
       while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
      
      return -1;
        
    }

    public static int helper(int s,int e,int[]arr,int target){
    while(s<=e){
          int mid=s+(e-s)/2;
          if(arr[mid]==target){

              return mid;
            }

          else if(arr[mid]>target){
               e=mid-1;
            }

          else{
            s=mid+1;
             }
           }

return -1;
}

}