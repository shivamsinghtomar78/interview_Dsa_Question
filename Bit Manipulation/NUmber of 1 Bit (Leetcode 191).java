/*
Approach:In Built function;
Time complexity:O(1);
Space complexity:O(1);

*/

class Solution {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}

/*
Approach:Using left shift bit manipulation;
Time complexity:O(1);
Space complexity:O(1);

*/

class Solution {
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            int mask=(1<<i);
            if((n&mask)!=0) count++;

        }
        return count;
    }
}


/*
Approach:Using Right most 1 ;
Time complexity:O(1);
Space complexity:O(1);

*/

class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}


