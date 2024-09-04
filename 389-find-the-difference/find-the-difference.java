class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        int sumT=0;

        for(int i=0;i<s.length();i++){
            sum+=(int)s.charAt(i);
        }

        for(int i=0;i<t.length();i++){
            sumT+=(int)t.charAt(i);
        }
  
  return (char)(sumT-sum);

    }
}