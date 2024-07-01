class Solution {
    public String addBinary(String a, String b) {
StringBuilder res=new StringBuilder();
  int carry=0;
  int n=a.length()-1;
  int m=b.length()-1;

  while(n>=0 || m>=0 ||carry!=0){
      int i=n>=0 ? a.charAt(n)-'0':0;
      int j=m>=0 ? b.charAt(m)-'0':0;

     int ans=i+j+carry;

     res.append(ans%2);
     carry=ans/2;

     n--;
     m--;


  }

return res.reverse().toString();

        
    }
}