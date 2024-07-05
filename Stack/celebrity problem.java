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
