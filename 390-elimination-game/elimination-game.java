class Solution {
    public int lastRemaining(int n) {
        
        return helper(n,true);

    }

    public int helper(int n ,boolean ltor){
        if(n==1){
            return 1;
        }

        if(ltor){
            return 2*helper(n/2,false);
        }else{
            if(n%2==0){
                return 2*helper(n/2,true)-1;
            }
            else{
                return 2*helper(n/2,true);
            }
        }
    }
}