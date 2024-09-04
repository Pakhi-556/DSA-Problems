class Solution {
    public int countBinarySubstrings(String s) {
        int count=0;

        int prevcount=0;
        int currcount=1;

        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)==s.charAt(i))
            {
                currcount++;
            }
            else
            {
                prevcount=currcount;
                currcount=1;
            }

            if(prevcount>=currcount)
            {
                count++;
            }
        }
        return count;
    }
}