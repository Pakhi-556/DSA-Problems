class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int demo[]=new int [arr.length];//this called as shallow cpy
        for(int i=0;i<demo.length;i++){
            demo[i]=arr[i];
        }

        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap();
        int j=1;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]));
            }else{
                map.put(arr[i],j++);
            }

        }

        for(int i=0;i<arr.length;i++){
           demo[i]=map.get(demo[i]);
        }


        return demo;
        
    }
}