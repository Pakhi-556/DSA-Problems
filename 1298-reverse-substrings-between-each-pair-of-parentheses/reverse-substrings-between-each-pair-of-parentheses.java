class Solution {
    public String reverseParentheses(String s) {

        Stack<String> st=new Stack();
        int j=0;
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(ans.toString());
                ans.setLength(0);
            }
            else if(s.charAt(i)==')'){
                ans.reverse();
                ans.insert(0,st.pop());
            }else{
                ans.append(s.charAt(i));
            }

        }


        return ans.toString();
        
    }
}