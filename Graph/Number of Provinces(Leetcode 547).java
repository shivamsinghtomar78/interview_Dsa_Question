/*
Appraoch:using BFS  ;
Time Complexity:O(N^2);
Space Complexity:O(N)

  */

class Solution {
    public int findCircleNum(int[][] adj) {
        int  n=adj.length;
        int count=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                bfs(i,vis,adj);
                count++;
            }
        }
        return count;
    }
    private void bfs (int i,boolean[] vis ,int[][] adj){
        int n=adj.length;
        vis[i]=true;
        Queue<Integer> q=new LinkedList<>();
            q.add(i);
            while(q.size()>0){
                int front=q.remove();
                for(int j=0;j<n;j++){
                    if(adj[front][j]==1 && vis[j]==false){
                        q.add(j);
                        vis[j]=true;
                    }
                }
            }
    }
}



/*
Appraoch:using DFS  ;
Time Complexity:O(N^2);
Space Complexity:O(N)

  */

class Solution {
    public int findCircleNum(int[][] adj) {
        int  n=adj.length;
        int count=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,vis,adj);
                count++;
            }
        }
        return count;
    }

    private void dfs(int i, boolean[] vis, int[][] adj) {
        int n = adj.length;
        vis[i] = true;

        for (int j = 0; j < n; j++) {
            if (adj[i][j] == 1 && vis[j] == false) {
                dfs(j,vis,adj);
            }
        }

    }
}


