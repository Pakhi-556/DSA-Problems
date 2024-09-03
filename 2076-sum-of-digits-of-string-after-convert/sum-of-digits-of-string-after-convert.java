class Solution {
    public int getLucky(String s, int k) {

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){

            sb.append(s.charAt(i)-'a'+1);
        }
        
        while(k>0){
            int temp=0;
            for(char c:sb.toString().toCharArray()){
                temp+=c-'0';
            }

            sb=new StringBuilder(String.valueOf(temp));
            k--;
        }

        return Integer.parseInt(sb.toString());
    }
}