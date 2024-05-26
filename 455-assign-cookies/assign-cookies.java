class Solution {
    public int findContentChildren(int[] g, int[] s) {

       Arrays.sort(g);
       Arrays.sort(s);

       int i=0;
       int gl=g.length;
       int sl=s.length;

       for(int j=0;j<sl;j++){
        if(i<gl && g[i]<=s[j]){
            i++;
        }
       }
      return i;
        
    }
}