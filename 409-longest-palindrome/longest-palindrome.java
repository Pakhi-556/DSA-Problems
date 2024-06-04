class Solution {
    public int longestPalindrome(String s) {

        if(s.length()==1){
            return 1;
        }

        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
           map.put(c, map.getOrDefault(c, 0) + 1);
            
        }

        int oddcount=-1;

       for(int val:map.values()){

           if(val%2!=0){
               oddcount++;
           }
       }
        
        return oddcount>0 ? s.length()-oddcount:s.length();
    }
}