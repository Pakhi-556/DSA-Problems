class Solution {
    public boolean detectCapitalUse(String word) {
 
        int cap=0;
        int small=0;
        
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='a' &&word.charAt(i)<='z'){
                small++;
            }else{
                cap++;
            }
        }

        if((cap==1 && (word.charAt(0)>='A'&& word.charAt(0)<='Z'))|| cap==word.length()||word.length()==1 || cap==0){
            return true;
        }

        return false;
        
    }
}