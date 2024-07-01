class Solution {
    public String addBinary(String a, String b) {
int n=a.length()-1;
int m=b.length()-1;
int carry=0;

StringBuilder ab=new StringBuilder();

while(n>=0 || m>=0 || carry>0){
    int a1= n>=0 ? a.charAt(n)-'0':0;
    int a2= m>=0 ? b.charAt(m)-'0':0;

    int sum=a1+a2+carry;

    ab.append(sum%2);
    carry=sum/2;
 
     n--;
     m--;
 
  }
      return ab.reverse().toString();    
    }
}