class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap();
        ArrayList<Integer> arr=new ArrayList();

        for(int i:nums2){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i:nums1){
            if(map.containsKey(i)){
                arr.add(i);
                map.put(i,map.getOrDefault(i,0)-1);
                if(map.get(i)==0){
                    map.remove(i);
                }
            }
        }

        int ans[]=new int[arr.size()];

        for(int i=0;i<ans.length;i++){
            ans[i]=arr.get(i);
        }
        return ans;
     }
}