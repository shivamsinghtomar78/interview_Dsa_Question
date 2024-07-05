/*
Approach-1:iterative 
Time complexity:O(n);
Space complexity :O(1);
Problem:https://www.geeksforgeeks.org/problems/the-celebrity-problem/1  */

 class Solution
{ 
    int celebrity(int M[][], int n)
    {
        // Step 1: Find a potential celebrity
        int candidate = 0;
        for(int i = 1; i < n; i++) {
            if(M[candidate][i] == 1) {
                candidate = i;
            }
        }
        
        // Step 2: Verify if the candidate is actually a celebrity
        for(int i = 0; i < n; i++) {
            if(i != candidate) {
                if(M[candidate][i] == 1 || M[i][candidate] == 0) {
                    return -1;
                }
            }
        }
        
        return candidate;
    }
}



/*
Approach-1:iterative 
Time complexity:O(n);
Space complexity :O(n);
Problem:https://www.geeksforgeeks.org/problems/the-celebrity-problem/1  */

class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> st=new Stack<>();
        for (int i = 0; i <n ; i++) {
            st.push(i);
            
        }
        while(st.size()>1){
            int v1=st.pop();
            int v2=st.pop();
            if(M[v1][v2]==0) st.push(v1);
            else if(M[v2][v1]==0) st.push(v2);
        }
        if(st.size()==0) return -1;
        int potential=st.pop();
        for (int i = 0; i <n ; i++) {
            if(M[potential][i]==1)  return -1;
            
        }
        for (int i = 0; i <n ; i++) {
            if(i==potential) continue;
            if(M[i][potential]==0)  return -1;

        }
        return potential;
    }
}

