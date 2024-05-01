class Solution {

    public  static String reverse(String s,int k){

        char[] ch=s.toCharArray(); 
        for(int i=0,j=k;i<(k+1)/2;i++,j--){
          char temp=ch[i];
          ch[i]=ch[j];
          ch[j]=temp;
        }

        return new String(ch);
    }
    public  String reversePrefix(String word, char ch) {

        int i=0;
        int x=0;
        while(i<word.length()){
            if(word.charAt(i)==ch){
               x=i;
               break;
            }
            i++;
        }

        return reverse(word,x);

    }
}