class Solution {
    public String licenseKeyFormatting(String s, int k) {

        StringBuilder sb =new StringBuilder();
        int count =0;
        // traverse the loop from rightto left

        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);

            if(c=='-'){
                continue;
            }

            if(!Character.isDigit(c) && c>=97){
                c-=32;
            }

            if(count==k){
                sb.append('-');
                count=0;
            }

            sb.append(c);
            count++;
        }


        return sb.reverse().toString();
        
    }
}