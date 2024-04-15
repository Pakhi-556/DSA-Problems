class Solution {
    public static double helper(int[] arr){
        int s=0;
        int e=arr.length-1;
        int mid=(s+e)/2;
         if((e+1)%2==0){
            return (arr[mid]+arr[mid+1])/2;
         }

         return arr[mid]/2;
       
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[m+n];
        int i=0;
        for( i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        
        for(int j=0;j<n;j++){
            arr[i++]=nums2[j];
        }

        Arrays.sort(arr);

       if(arr.length%2!=0){
        return (double) arr[(arr.length)/2];
       }else{
        int a=(arr.length)/2;
        int b=a-1;

        double x=arr[a];
        double y=arr[b];

        return (x+y)/2;
       }
        
    }
}