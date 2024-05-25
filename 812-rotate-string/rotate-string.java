class Solution {
    public boolean rotateString(String p, String q) {
        String str=p+p;

        if(p.length()!=q.length()){
            return false;
        }
        int n=q.length();
        for(int i=0;i<=(str.length()-n);i++){

            if(str.substring(i,i+n).equals(q)){
                return true;
            }

        }

        return false;
    }
}