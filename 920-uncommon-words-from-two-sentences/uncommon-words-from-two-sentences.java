class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] st1=s1.split("\\s+");
        String[] st2=s2.split("\\s+");

        HashMap<String,Integer> a1=new HashMap();
       
        for(int i=0;i<st1.length;i++){
            a1.put(st1[i],a1.getOrDefault(st1[i],0)+1);
        } 

        for(int i=0;i<st2.length;i++){
           a1.put(st2[i],a1.getOrDefault(st2[i],0)+1);     
        }  

        ArrayList<String> ans=new ArrayList();
        for(Map.Entry<String,Integer> e:a1.entrySet()){

            if(e.getValue()==1){
             ans.add(e.getKey());
            }

        }

        String[] answer=new String[ans.size()];
        int j=0;
        for(int i=0;i<ans.size();i++){
            answer[j++]=ans.get(i);
        }


return answer;
    }
}