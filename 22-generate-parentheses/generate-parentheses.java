class Solution {
    public List<String> generateParenthesis(int n) {

        ArrayList<String> ans=new ArrayList();
        backtrack(n,ans,"",0,0);
        return ans;       
    }

    public static void backtrack(int n,ArrayList<String> ans,String curr,int o,int c){

        if(curr.length()==n*2){
            ans.add(curr);
            return;
        }

        if(o<n){
            backtrack(n,ans,curr+"(",o+1,c);
        }

        if(c<o){
            backtrack(n,ans,curr+")",o,c+1);
        }


    }
}