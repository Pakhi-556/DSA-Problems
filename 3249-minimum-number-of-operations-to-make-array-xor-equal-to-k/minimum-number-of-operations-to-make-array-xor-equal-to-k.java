class Solution {
    public int minOperations(int[] nums, int k) {
        int op = 0;
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        
        
        if (xor == k) {
            return 0;
        }
        
       
        int target = xor ^ k;
      
        while (target > 0) {
            op++;
            target &= (target - 1); 
        }
        
        return op;
    }
}