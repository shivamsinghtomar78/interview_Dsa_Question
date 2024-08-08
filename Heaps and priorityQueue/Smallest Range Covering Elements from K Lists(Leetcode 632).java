/*
Approach-1:min Heap;
Time complexity:O(NLogK);
Space complexity:O(K); */

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] ans = {0, Integer.MAX_VALUE};
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int k = nums.size();
        int max = Integer.MIN_VALUE;

        // Initialize the priority queue and track the maximum element
        for (int i = 0; i < k; i++) {
            int ele = nums.get(i).get(0);
            pq.add(new Triplet(ele, i, 0));
            max = Math.max(max, ele);
        }

        while (true) {
            Triplet top = pq.remove();
            int ele = top.ele;
            int row = top.row;
            int col = top.col;

            // Update the minimum range
            if (max - ele < ans[1] - ans[0]) {
                ans[0] = ele;
                ans[1] = max;
            }

            // If we've reached the end of a list, break out of the loop
            if (col == nums.get(row).size() - 1) {
                break;
            }

            // Add the next element from the current list to the priority queue
            int next = nums.get(row).get(col + 1);
            max = Math.max(max, next);
            pq.add(new Triplet(next, row, col + 1));
        }

        return ans;
    }

    // Helper class to represent a triplet of (element, row, column)
    class Triplet implements Comparable<Triplet> {
        int ele;
        int row;
        int col;

        Triplet(int ele, int row, int col) {
            this.ele = ele;
            this.row = row;
            this.col = col;
        }

        @Override
        public int compareTo(Triplet t) {
            return this.ele - t.ele;
        }
    }
}
