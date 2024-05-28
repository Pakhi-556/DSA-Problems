class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        if(s.length()!=t.length()){
            return 0;
        }

        int i=0;
        int n=s.length();
        int current=0;
        int maxLength=0;
        for (int end = 0; end < n; ++end) {
            current += Math.abs(s.charAt(end) - t.charAt(end));

            while (current > maxCost) {
                current -= Math.abs(s.charAt(i) - t.charAt(i));
                ++i;
            }

            maxLength = Math.max(maxLength, end - i + 1);
        }

        return maxLength;
        
    }
}