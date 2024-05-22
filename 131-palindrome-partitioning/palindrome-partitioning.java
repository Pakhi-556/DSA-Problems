class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList();
        backtrack(s,0,new ArrayList(),ans);

        return ans;
    }

    public boolean palindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left++)!=s.charAt(right--)){
                return false;
            }
        }

        return true;
    }


    public void backtrack(String s,int start,List<String> path, List<List<String>> ans){
        if(start==s.length()){
            ans.add(new ArrayList<>(path));
        }

        for(int i=start+1;i<=s.length();i++){
            if(palindrome(s,start,i-1)){
                path.add(s.substring(start,i));
                backtrack(s,i,path,ans);
                path.remove(path.size()-1);
            }
        }
    }


}