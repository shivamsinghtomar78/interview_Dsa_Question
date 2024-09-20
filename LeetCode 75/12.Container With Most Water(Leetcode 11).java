/*
Approach: pointer and greedy;
Time complexity:O(N);
Space complexity:O(1); */


class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxWater=Integer.MIN_VALUE;
        while(i<j){
            int w=j-i;
            int h=Math.min(height[i],height[j]);
            int area=w*h;
            maxWater=Math.max(maxWater,area);
            if(height[i]>height[j]){
                j--;
            }
            else i++;
        }
        return maxWater;
    }
}
