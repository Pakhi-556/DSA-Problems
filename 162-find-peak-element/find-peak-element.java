class Solution {
    public int findPeakElement(int[] arr) {


       /* for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                
                return i-1;
            }

            
        }
        
        return nums.length-1;*/

        // by using binary search 
        
        if(arr.length==1){
            return 0;
        }

        if(arr[0]>arr[1]){
            return 0;
        }

        if(arr[arr.length-1]>arr[arr.length-2]){
            return arr.length-1;
        }
        int i=1;
        int j=arr.length-2;
        
        while(i<=j){
        int mid=(i+j)/2;
        if(arr[mid]>arr[mid-1] && arr[mid+1]<arr[mid]){
            return mid;
        }
        else if(arr[mid]>arr[mid-1]){
            i=mid+1;
        }else{
            j=mid-1;
        }
        }

        return -1;
    }
}