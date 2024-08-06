class Solution {
    public int minimumPushes(String word) {
        int[] arr=new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            arr[ch-'a']++;
        }
        

        Arrays.sort(arr);

        int totalpresses=0;

        for(int i=0;i<26;i++){

            totalpresses+=(i/8+1)*arr[26-i-1];
        }

        return totalpresses;
    }
}