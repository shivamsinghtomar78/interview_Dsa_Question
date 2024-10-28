/*
Aprroach:Using DFS;
Time Complexity:O(V+E);
Space Complexity:O(V);
Question Link : https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1
*/
class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean [] visited=new boolean[v];
        boolean [] inRecursion=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i] && dfs(adj,i,visited,inRecursion)){
                return true;
            }
        }
        return false;
    }
    
    
    
    private boolean dfs(ArrayList<ArrayList<Integer>> adj,int u,boolean [] visited, boolean [] inRecursion){
        visited[u]=true;
        inRecursion[u]=true;
        for(int v:adj.get(u)){
            // if not visited ,then we check for cycle in dfs
            if(visited[v]==false && dfs(adj,v,visited,inRecursion)){
                return true;
            }
            else if(inRecursion[v]==true)   return true;
        }
        inRecursion[u]=false;
        return false;
    }
}



/*
Aprroach:Using BFS;
Time Complexity:O(V+E);
Space Complexity:O(V);
Question Link : https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1
*/



class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int N, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q=new LinkedList<>();
        
        int []indegree=new int[N];
        for(int u=0;u<N;u++){
            for(int v:adj.get(u)){
                indegree[v]++;
            }
        }
        
        
        int count=0;
        for(int i=0;i<N;i++){
            if(indegree[i]==0){
                q.add(i);
                count++;
            }
        }
        
        while(!q.isEmpty()){
            int u=q.remove();
            
            
            for(int v:adj.get(u)){
                indegree[v]--;
                
                if(indegree[v]==0){
                    q.add(v);
                    count++;
                }
            }
        }
        
        
        if(count==N) return false;// we visited all the node ,mtlb no cycle
        else return true;
        
        
    }
}
