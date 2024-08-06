class Solution {
    public int minimumPushes(String word) {
        int[] arr=new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            arr[ch-'a']++;
        }

        Integer[] ans=new Integer[26];
        for(int i=0;i<26;i++){
            ans[i]=arr[i];
        }

        Arrays.sort(ans,Collections.reverseOrder());

        int totalpresses=0;

        for(int i=0;i<26;i++){
            if(ans[i]==0){
                break;
            }

            totalpresses+=(i/8+1)*ans[i];
        }

        return totalpresses;
    }
}