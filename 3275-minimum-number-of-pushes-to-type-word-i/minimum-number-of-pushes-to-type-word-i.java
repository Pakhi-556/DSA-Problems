class Solution {
    public int minimumPushes(String word) {

        int arr[]=new int[26];
        //count the frequency
        for(char ch: word.toCharArray()){

            arr[ch-'a']++;
        }

        //sort an array so those char frequency has maximax should assign first (0-8);
        Arrays.sort(arr);

        int minpush=0;

        for(int i=0;i<26;i++){
            minpush+=(i/8+1)*arr[26-i-1];
        } 

        return minpush;
    }
}