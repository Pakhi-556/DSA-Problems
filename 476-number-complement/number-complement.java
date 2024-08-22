class Solution {
    public int findComplement(int num) {
       int answer=0;
       int i=0;

       while(num>0){
        if(num%2==0){
            answer+=(int)Math.pow(2,i);
        }

        i++;
        num/=2;
       }

       return answer;
        
    }
}