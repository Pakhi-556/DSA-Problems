class Solution {
    public List<Integer> diffWaysToCompute(String str) {

        List<Integer> res=new LinkedList<Integer>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*' || str.charAt(i)=='+' || str.charAt(i)=='-'){
                String s1=str.substring(0,i);
                String s2=str.substring(i+1);
                List<Integer> p1=diffWaysToCompute(s1);
                List<Integer> p2=diffWaysToCompute(s2);

                for(Integer i1:p1){
                    for(Integer i2:p2){
                        int c=0;
                        switch(str.charAt(i)){
                            case '+':
                              c=i1+i2;
                              break;
                            case '-':
                              c=i1-i2;
                              break;
                            case '*':
                              c=i1*i2;
                              break;    

                        }
                        res.add(c);
                    }
                }



            }
        }

        if(res.size()==0){
            res.add(Integer.valueOf(str));
        }
        return res;
    }
}