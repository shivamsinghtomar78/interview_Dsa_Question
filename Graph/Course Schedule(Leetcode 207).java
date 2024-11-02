/*
Approach : Using BFS
Time complexity:O(V+E)
Space Complexity:O(V+E)
*/


class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Create adjacency list and indegree array
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] indegree = new int[numCourses];

        // Build the graph
        for (int[] pair : prerequisites) {
            int a = pair[0];
            int b = pair[1];

            // b --> a
            adj.putIfAbsent(b, new ArrayList<>());
            adj.get(b).add(a);

            // Increment indegree of course a
            indegree[a]++;
        }

        return topologicalSortCheck(adj, numCourses, indegree);
    }

    private boolean topologicalSortCheck(Map<Integer, List<Integer>> adj, int n, int[] indegree) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;

        // Enqueue all courses with indegree 0
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                count++;
                queue.offer(i);
            }
        }

        // Process the courses in the queue
        while (!queue.isEmpty()) {
            int u = queue.poll();

            // Decrease the indegree of neighboring courses
            if (adj.containsKey(u)) {
                for (int v : adj.get(u)) {
                    indegree[v]--;
                    if (indegree[v] == 0) {
                        count++;
                        queue.offer(v);
                    }
                }
            }
        }

        // If count matches the number of courses, return true
        return count == n;
    }
}

