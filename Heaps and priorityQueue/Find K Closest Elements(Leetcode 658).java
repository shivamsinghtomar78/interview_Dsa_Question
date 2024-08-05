/*
Approach-1:Max  Heap;
Time complexity:O(NLogN);
Space complexity:O(N); */


 class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> {
                if (a.d != b.d) {
                    return b.d - a.d; // Max heap based on distance
                }
                return b.val - a.val; // If distances are equal, prefer smaller value
            });

            for (int i = 0; i < arr.length; i++) {
                int dist = Math.abs(arr[i] - x);
                pair helper = new pair(dist, arr[i]);
                pq.add(helper);
                if (pq.size() > k) pq.poll();
            }

            List<Integer> ans = new ArrayList<>();
            while (!pq.isEmpty()) {
                pair p = pq.poll();
                ans.add(p.val);
            }

            Collections.sort(ans);
            return ans;
        }

        class pair {
            int d;
            int val;

            pair(int d, int val) {
                this.d = d;
                this.val = val;
            }
        }
    }
