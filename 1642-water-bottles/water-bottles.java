class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        int temp=numBottles;

        while(temp>=numExchange){
            temp=numBottles/numExchange;
            ans+=temp;
            temp+=numBottles%numExchange;
            numBottles=temp;
        }


        return ans;
    }
}