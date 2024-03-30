import java.util.*;
class Solution {
    public int helper(int nums[],int k){
        HashMap<Integer,Integer> map=new HashMap();

        int i=0;
        int j=0;
        int ans=0;
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }

            ans+=j-i+1;
            j++;
        }

        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int kalmost=helper(nums,k);
        int km1=helper(nums,k-1);


        return kalmost-km1;
        
    }


}