class Solution {


    public boolean isPowerOfTwo(int n) {
      /*if(n==1){
          return true;
      }
      if(n==0){
          return false;
      }
      while(n!=1){
          if(n%2!=0){
              return false;
          }

          n/=2;
      }

      return true;*/

      if(n<1){
        return false;
      }

      return (n & (n-1))==0;
    }
}