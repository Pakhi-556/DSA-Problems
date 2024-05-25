class Solution {

    public void swap(char S[],int i,int j){
        char temp=S[i];
        S[i]=S[j];
        S[j]=temp;
    }
    public int nextGreaterElement(int n) {
        String str=Integer.toString(n);
        char S[]= str.toCharArray();

        int i = str.length() - 2;
        StringBuilder ans = new StringBuilder();
        while(i>=0 && S[i]>=S[i+1]){
            i--;
        }

        // If it doesn't exist, return -1
        if (i<0) {
            return -1;
        }

       int k=S.length-1;

       while(S[k]<=S[i]){
        k--;
       }

       swap(S,i,k);
       
       for(int j=0;j<=i;j++)
            ans.append(S[j]);
        
        for(int j=S.length-1;j>i;j--)
            ans.append(S[j]);
        
        long ans_ = Long.parseLong(ans.toString());
        
        return (ans_ > Integer.MAX_VALUE) ? -1 : (int)ans_;
        
    }
}