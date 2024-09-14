class Solution {
    public boolean check(int n){
        int ori=n;

        while(n>0){
            int ld=n%10;
            n/=10;
            if(ld==0 || ori%ld!=0){
                return false;
            }


        }

        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList();

        for(int i=left;i<=right;i++){
            if(check(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}