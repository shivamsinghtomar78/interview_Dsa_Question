/*
Approach-1:Iterative 
Time complexity:O(n);
Space complexity:O(1)
  */

class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for (String ch : logs) {
            if (ch.equals("../")) {
                if (count > 0) count--;
            }
            else if (ch.equals("./")) count = count;
            else count++;
        }
        return count;
    }
}
