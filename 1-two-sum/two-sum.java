class Solution {
    public int[] twoSum(int[] arr, int target) {
       /* int res[]=new int[2];
     Map<Integer,Integer> map=new HashMap();
     for(int i=0;i<nums.length;i++){
         int rem=target-nums[i];
         if(map.containsKey(rem)){
             return new int[]{i,map.get(rem)};
         }

         map.put(nums[i],i);
     }
     return new int[]{};*/

     int n=arr.length;

    int ans[] =new int[2];
    //outer loop


    for(int i=0;i<n-1;i++){
       
       for(int j=i+1;j<n;j++){
           if((arr[i]+arr[j])==target){
              
               ans[0]=i;
               ans[1]=j;
                return ans;
 
             }

         }
    }

return ans;

        
    }

   
}