class Solution {
    public List<String> commonChars(String[] words) {

        int[] minfreq=new int[26];
        Arrays.fill(minfreq,Integer.MAX_VALUE);

        for(String word: words){
            int[] freq=new int[26];
            for(char c: word.toCharArray()){
                freq[c-'a']++;
            }

            for(int i=0;i<26;i++){
                minfreq[i]=Math.min(minfreq[i],freq[i]);
            }
        }


        List<String> r=new ArrayList();

        for(int i=0;i<26;i++){
            while (minfreq[i]-- > 0) {
                r.add(String.valueOf((char) (i + 'a')));
            }
        }
        return r;
    }
}