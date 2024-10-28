/*
Aprroach:Using DFS;
Time Complexity:O(V+E);
Space Complexity:O(V);
Question Link :https://www.geeksforgeeks.org/problems/topological-sort/1
*/


class Solution {
    // Function to return list containing vertices in Topological order.
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        int v=adj.size();
        boolean [] visited=new boolean[v];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<v;i++){
            if(!visited[i]) dfs(adj,i,visited,st);
            
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!st.isEmpty()){
            int n=st.pop();
            ans.add(n);
            
        }
        return ans;
    }
    
    private static  void dfs(ArrayList<ArrayList<Integer>> adj,int u,boolean [] visited,Stack<Integer> st){
        visited[u]=true;
        for(int v:adj.get(u)){
            if(!visited[v]) dfs(adj,v,visited,st);
        }
        
        // ab stack mein daalo

/*
Aprroach:Using DFS;
Time Complexity:O(V+E);
Space Complexity:O(V);
Question Link :https://www.geeksforgeeks.org/problems/topological-sort/1
*/


        class Solution {
    // Function to return list containing vertices in Topological order.
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
     int N=adj.size();
     Queue<Integer> q=new LinkedList<>();
     int[]indegree=new int[N];
     //1
     for(int u=0;u<N;u++){
         for(int v:adj.get(u)){
             indegree[v]++;         }
     }
     
     
     // 2
     for(int i = 0; i<N; i++) {
	        if(indegree[i] == 0) {
	            q.add(i);
	        }
	    }
	    //  3
	    
	    
	    ArrayList<Integer> result=new ArrayList<>();
	    while(!q.isEmpty()) {
	        int u = q.remove();
	         result.add(u);
	        
	        for(int v : adj.get(u)) {
	            indegree[v]--;
	            
	            if(indegree[v] == 0) {
	                q.add(v);
	            }
	            
	        }
	    }
	    
	    return result;
	    
	    
    }
}

 
