class Solution {
    public int titleToNumber(String s) {

    
        s=s.toUpperCase();
        if(s.length()==1){
            return (s.charAt(0)-'A')+1;
        }
        int c=s.length()-1;
        int ans=0;
        for(int i=0;i<s.length();i++){
            int ld=(s.charAt(i)-'A')+1;
            ans=26*ans+ld;

        }

      return ans;
        
    }
}