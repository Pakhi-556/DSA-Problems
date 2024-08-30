class Solution {
    public static int helper(int num)
    { 
        int sum=0;

        while(num!=0){
            int ld=num%10;
            sum+=ld;
            num/=10;
        }

        return sum;
    }
    public int addDigits(int num) {
        /*if(num>=0 && num<10){
            return num;

        }
        int sum=helper(num);
        while(sum>9){
            sum=helper(sum);
        }

       return sum; */

       if(num==0){
           return 0;
       }
       else if(num%9==0){
           return 9;
       }
       else{
           return num%9;
       }
        
    }
}