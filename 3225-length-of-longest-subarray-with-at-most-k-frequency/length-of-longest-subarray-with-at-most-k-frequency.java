class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap();
        
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.get(nums[j])>k){
                map.put(nums[i],map.get(nums[i])-1);
                i++;
            }
            
            max=Math.max(max,j-i+1);
            j++;
        }

        

  return max;
        
    }
}