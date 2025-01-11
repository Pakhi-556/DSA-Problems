class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k){
            return false;
        }

        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        int oddcount=0;
        for(int i=0;i<s.length();){
            int curr=ch[i];
            int count=0;

            while(i<s.length() && curr==ch[i]){
                count++;
                i++;
            }

            if(count%2!=0){
                oddcount++;
            }
        }
        return oddcount<=k;    }
}