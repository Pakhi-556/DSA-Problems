import java.math.BigInteger;  
class Solution {
    public String addStrings(String n1, String n2) {
        BigInteger a1=new BigInteger(n1);
        BigInteger a2=new BigInteger(n2);

        BigInteger sum=a1.add(a2);

        return sum.toString();
    }
}