class Solution {

    public void helper(int i,int[] can,int target,List<List<Integer>> ans,List<Integer> com){
        if(target==0){
            ans.add(new ArrayList(com));

            return ;
        }

        for(int j=i;j<can.length;j++){

            if(j>i && can[j]==can[j-1]){
                continue;
            }

            if(can[j]>target){
                break;
            }

            com.add(can[j]);
            helper(j+1,can,target-can[j],ans,com);
            com.remove(com.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans=new ArrayList();

        helper(0,candidates,target,ans,new ArrayList());

        return ans;
    
    }


}