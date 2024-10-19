/*
Aprroach:using Xor and In-built bitCount method;
Time complexity:O(1);
Space complexity:O(1);
*/

class Solution {
    public int minBitFlips(int start, int goal) {
        // XOR will give 1 only where bits differ
        int xor = start ^ goal;
        // Count number of 1s in XOR result
        return Integer.bitCount(xor);
    }
}
