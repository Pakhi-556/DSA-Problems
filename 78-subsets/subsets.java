class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans=new ArrayList();
        backtracking(nums,0,new ArrayList(),ans);

        return ans;
        
    }

    private void backtracking(int[] nums,int s,List<Integer> ll, List<List<Integer>> ans){
        ans.add(new ArrayList(ll));
        for(int i=s;i<nums.length;i++){
            ll.add(nums[i]);
            backtracking(nums,i+1,ll,ans);
            ll.remove(ll.size()-1);
        }
    }
}