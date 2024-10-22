/*
Appraoch:using BFS  ;
Time Complexity:O(V+E);
Space Complexity:O(N)

  */

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n=adj.size();
        boolean[] visited=new boolean[n];
        visited[0]=true;
        bfs(0,adj,visited);
        for(boolean ele:visited){
            if(ele==false) return false;
        }
        return true;

    }
    private void bfs(int start,List<List<Integer>> adj,boolean[] visited){
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(q.size()>0){
            int front=q.remove();
            for(int ele:adj.get(front)){
                if(!visited[ele]){
                    visited[ele]=true;
                    q.add(ele);
                }
            }

        }
    }
}
