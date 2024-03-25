class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> ll=new ArrayList();
        Set<Integer> s=new HashSet();

        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                ll.add(nums[i]);
            }
            s.add(nums[i]);
        }

        return ll;
    }
}