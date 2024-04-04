class Solution {
    public int maxDepth(String s) {

        Stack<Character> st=new Stack();
        int max=0;
        int i=0;
        int count=0;
        while(i<s.length()){ 
            if(s.charAt(i)=='('){
               st.push('(');
               count++;
               max=Math.max(max,count);
            }

            else if(s.charAt(i)==')'){
                st.pop();
                count--;
            }
           i++; 
        }


        return max;
    }
}