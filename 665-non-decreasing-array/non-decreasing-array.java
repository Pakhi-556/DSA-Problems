class Solution {
    public boolean checkPossibility(int[] arr) {

     /// we have to create a array
     int count=0;

     for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
           count++;
           if(count>1){
            return false;
           }

           if(i>0 && arr[i-1]>arr[i+1]){
            arr[i+1]=arr[i];
           }else{
            arr[i]=arr[i+1];
           }
        }


     }


     return true;
        
    }
}