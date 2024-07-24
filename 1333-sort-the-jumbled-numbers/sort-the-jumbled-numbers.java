import java.util.*;

class Solution {
    public int helper(int[] map,int n){
          int ans=0;
          int i=0;
          while(n>0){
            int ld=n%10;
            ans+=(int)Math.pow(10,i++)*map[ld];
            n/=10;
          }

          return ans;
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[][] temp=new int[nums.length][2];

        for(int i=0;i<nums.length;i++){
           String aux = "";
            String numeroEvaluado = String.valueOf(nums[i]);
            for (int j = 0; j < numeroEvaluado.length(); j++) {
                aux += mapping[numeroEvaluado.charAt(j) - '0'];
            }
            temp[i] = new int[]{nums[i], Integer.parseInt(aux)};
            
        }
        
        Arrays.sort(temp, (n1, n2) -> n1[1]-n2[1]);

        for(int i=0;i<temp.length;i++){
            nums[i]=temp[i][0];
        }
        return nums;
        
    }
}