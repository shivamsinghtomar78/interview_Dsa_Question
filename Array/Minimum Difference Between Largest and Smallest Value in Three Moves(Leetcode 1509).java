/*
Approach-1:
Time complexity:O(nlogn)
Space complexity:O(1) */

class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if (n <= 4) return 0;
        
        Arrays.sort(nums);
        
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            minDiff = Math.min(minDiff, nums[n - 4 + i] - nums[i]);
        }
        
        return minDiff;
    }
}
  
