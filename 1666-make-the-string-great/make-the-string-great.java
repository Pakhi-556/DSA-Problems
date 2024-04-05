class Solution {
    public String makeGood(String s) {
        StringBuilder b=new StringBuilder();
        /*for(int i=0;i<s.length()-1;i++){
            if(((s.charAt(i)-'a')==(s.charAt(i+1)-'A'))||((s.charAt(i+1)-'a')==(s.charAt(i)-'A'))){
                
            }
        }*/

        Stack<Character> st=new Stack();

        for(char c:s.toCharArray()){
            if(!st.isEmpty() && Math.abs(c-st.peek())==32){
                st.pop();
            }else{
                st.push(c);
            }
        }
        
        while(!st.isEmpty()){
            b.insert(0,st.pop());
        }

        return b.toString();
        
    }
}