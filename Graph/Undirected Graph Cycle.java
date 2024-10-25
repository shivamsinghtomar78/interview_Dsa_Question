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



/*
Aprroach:Using DFS;
Time Complexity:O(V+E);
Space Complexity:O(V);
Question Link : https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
*/

class Solution {
    class Pair {
        int ele;
        int parent;
        Pair(int ele, int parent) {
            this.ele = ele;
            this.parent = parent;
        }
    }
    
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(!visited[i] && bfs(adj, i, visited)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean bfs(ArrayList<ArrayList<Integer>> adj, int start, boolean[] visited) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start, -1));
        visited[start] = true;
        
        while(!q.isEmpty()) {
            Pair p = q.poll();
            int curr = p.ele;
            int parent = p.parent;
            
            for(int neighbor : adj.get(curr)) {
                if(!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(new Pair(neighbor, curr));
                }
                else if(neighbor != parent) {
                    return true;
                }
            }
        }
        return false;
    }
}
