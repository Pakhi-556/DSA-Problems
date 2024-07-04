class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> res=new Stack();

        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int b=res.pop();
                int a=res.pop();
                res.push(a+b);

            }
           else if(tokens[i].equals("*")){
                int b=res.pop();
                int a=res.pop();
                res.push(a*b);

            }
            else if(tokens[i].equals("-")){
                int b=res.pop();
                int a=res.pop();
                res.push(a-b);

            }
            else if(tokens[i].equals("/")){
                int b=res.pop();
                int a=res.pop();
                res.push(a/b);

            }else{
                res.push(Integer.parseInt(tokens[i]));

            }
        }

        return res.peek();
    }
}