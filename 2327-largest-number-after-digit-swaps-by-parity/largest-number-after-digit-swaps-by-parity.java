class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> odd=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> even=new PriorityQueue<>(Collections.reverseOrder());

        String s=""+num;

        for(char ch:s.toCharArray()){
            if(Character.getNumericValue(ch)%2==0){
                even.add(Character.getNumericValue(ch));
            }else{
                odd.add(Character.getNumericValue(ch));
            }
        }

        String str="";

        for(char ch: s.toCharArray()){
            if(Character.getNumericValue(ch)%2==0){
                str+=""+even.poll();
            }else{
                str+=""+odd.poll();
            }
        }

        int result=Integer.parseInt(str);

        return result;

    }
}