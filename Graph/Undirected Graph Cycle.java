/*
Aprroach:Using DFS;
Time Complexity:O(V+E);
Space Complexity:O(V);
Question Link : https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
*/


class Solution {
    // Function to detect cycle in an undirected graph
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int v = adj.size();
        boolean[] visited = new boolean[v];
        
        // Check each vertex as a potential starting point
        for(int i = 0; i < v; i++) {
            if(!visited[i] && isCycleDFS(adj, i, visited, -1)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean isCycleDFS(ArrayList<ArrayList<Integer>> adj, int u, boolean[] visited, int parent) {
        visited[u] = true;
        
        // Check all adjacent vertices of vertex u
        for(int v : adj.get(u)) {
            // Skip if the adjacent vertex is the parent
            if(v == parent) continue;
            
            // If adjacent vertex is already visited, we found a cycle
            if(visited[v]) return true;
            
            // Recursively visit the adjacent vertex
            if(isCycleDFS(adj, v, visited, u)) {
                return true;
            }
        }
        return false;
    }
}
