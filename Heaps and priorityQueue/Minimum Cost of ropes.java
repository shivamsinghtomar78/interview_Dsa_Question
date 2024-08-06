/*
Approach-1:Max  Heap;
Time complexity:O(NLogN);
Space complexity:O(N);
Problem:https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
*/

class Solution {
    public long minCost(long[] arr, int n) {
        
        PriorityQueue<Long> pq = new PriorityQueue<>(n);
        
       
        for (long rope : arr) {
            pq.offer(rope);
        }
        
        long totalCost = 0;
        
     
        while (pq.size() > 1) {
            
            long first = pq.poll();
            long second = pq.poll();
            
            
            long combinedLength = first + second;
            totalCost += combinedLength;
            
            pq.offer(combinedLength);
        }
        
        return totalCost;
    }
}
