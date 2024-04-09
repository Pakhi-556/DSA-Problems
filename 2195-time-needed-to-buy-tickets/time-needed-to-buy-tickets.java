class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int value=tickets[k];

        int second=0;

        for(int i=0;i<tickets.length;i++){
            int max= (i<=k) ? value:value-1;
            second+=(tickets[i]>max)? max:tickets[i];
        }
        return second;
    }
}