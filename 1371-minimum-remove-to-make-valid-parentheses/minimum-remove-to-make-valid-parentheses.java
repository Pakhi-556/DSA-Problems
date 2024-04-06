class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack();
        int l=0;
        int r=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(i);
            }else if(c==')'){
                if(!st.isEmpty() && s.charAt((int)st.peek())=='('){
                st.pop();
                }else{
                    st.push(i);
                }

            }
            else{
                continue;
            }
        }

       StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(!st.isEmpty() && (int)st.peek()==i){
                st.pop();
                continue;
            }else{
                sb.append(s.charAt(i));
            }
        }


        return sb.reverse().toString();

    }
}