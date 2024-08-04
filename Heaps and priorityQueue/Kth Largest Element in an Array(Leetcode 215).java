/*
Approach-1:Min  Heap;
Time complexity:O(NLogk);
Space complexity:O(k); */

class Solution {
     public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int ele:nums) {
            pq.add(ele);
            if(pq.size()>k) pq.remove();


        }
        return pq.peek();
    }
}
