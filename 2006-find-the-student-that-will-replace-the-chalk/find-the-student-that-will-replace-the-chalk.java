class Solution {
    public int chalkReplacer(int[] chalk, int k) {

     long totalsum=0;
     for(int i:chalk){
        totalsum+=i;
     }
     
     //check if the number is fully didvible by k or leaves some to ckeck itwill return some 
     
     k%=totalsum;

     for(int i=0;i<chalk.length;i++){
        if(chalk[i]>k){
            return i;
        }
        k-=chalk[i];
     }

     return -1;
        
    }
}