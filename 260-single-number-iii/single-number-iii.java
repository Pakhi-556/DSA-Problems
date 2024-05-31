class Solution {
    public int[] singleNumber(int[] nums) {

        HashMap<Integer,Integer>  map=new HashMap();
        ArrayList<Integer> ans=new ArrayList();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
           if(e.getValue()==1)
            ans.add(e.getKey());
        }
        int arr[]=new int[ans.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=ans.get(i);
        }

        return arr;
    }
}