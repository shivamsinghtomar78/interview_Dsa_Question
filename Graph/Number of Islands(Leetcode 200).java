/*
Appraoch:using BFS  ;
Time Complexity: O(M*N)
Space Complexity:O(M*N)

  */

class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
                    bfs(i,j,grid,vis);
                    count++;
                }
            }
        }
        return count;   
    }
    
    private void bfs(int row,int col,char[][] grid, boolean[][] vis){
        int m=grid.length;    
        int n=grid[0].length;  
        
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(row,col));
        vis[row][col]=true;    
        
        while(q.size()>0){
            pair front=q.remove();
             row=front.row;col=front.col;
            //Top --> row-1,col
            if(row>0){
                if(vis[row-1][col]==false && grid[row-1][col]=='1'){
                    q.add(new pair(row-1,col));
                    vis[row-1][col]=true;
                }
            }
            //bottom--> row+1,col
             if((row+1)<m){
                if(vis[row+1][col]==false && grid[row+1][col]=='1'){
                    q.add(new pair(row+1,col));
                    vis[row+1][col]=true;
                }
            }
            //Left-->row,col-1
            if(col>0){
                if(vis[row][col-1]==false && grid[row][col-1]=='1'){
                    q.add(new pair(row,col-1));
                    vis[row][col-1]=true;
                }
            }
            // Right--> row,col+1
             if((col+1)<n){
                if(vis[row][col+1]==false && grid[row][col+1]=='1'){
                    q.add(new pair(row,col+1));
                    vis[row][col+1]=true;
                }
            }
        }
    }
    
    class pair{
        int row;
        int col;
        pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
}



/*
Appraoch:using DFS ;
Time Complexity: O(M*N)
Space Complexity:O(M*N)

  */

class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
                    dfs(i,j,grid,vis);
                    count++;
                }
            }
        }
        return count;   
    }
    private void dfs(int i,int j,char[][] grid, boolean[][] vis){
        int m=grid.length;
        int n=grid[0].length;
        vis[i][j]=true;
        // Top
        if(i-1>=0 && grid[i-1][j]=='1' && vis[i-1][j]==false) dfs(i-1,j,grid,vis);

        //left
        if(j-1>=0 && grid[i][j-1]=='1' && vis[i][j-1]==false) dfs(i,j-1,grid,vis);

        // bottom
        if(i+1<m && grid[i+1][j]=='1' && vis[i+1][j]==false) dfs(i+1,j,grid,vis);

        //right
        if(j+1<n && grid[i][j+1]=='1' && vis[i][j+1]==false) dfs(i,j+1,grid,vis);
    }
    
    
}
