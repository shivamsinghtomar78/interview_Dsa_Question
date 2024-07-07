/*
Approach-1:brute force
Time complexity :O(Log(Numbottles))
Space complexity:O(1)
  */
  class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans =0;
        int r=0;
        int n=numBottles;
        while((n+r)>=numExchange){
            int exchange=(n+r)/numExchange;
            ans+=exchange;
            r=(n+r)%numExchange;
            n=exchange;
        }
        ans+=numBottles;
        return ans;
    }
}

/*
Approach-2:Editorial
Time complexity :O(numBottles/numExchange−1)
Space complexity:O(1)
  */


class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int consumed =0;
        while(numBottles>=numExchange){
            consumed+=numExchange;
            numBottles-=numExchange;
            numBottles+=1;
        }
        return consumed+numBottles;
    }
}

