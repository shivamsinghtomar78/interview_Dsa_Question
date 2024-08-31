
/*
Approach-1:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(n^2);
Space complexity:O(n^2);
*/
class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        int dp[][]=new int[n][n];
        for(int k=0;k<n;k++){
            int i=0,j=k;
            while(j<n){
                if(i==j) {
                    dp[i][j]=1;
                    count++;
                }
                else if(j==i+1){
                    if(s.charAt(i)==s.charAt(j)){
                         dp[i][j]=1;
                         count++;
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(j)){
                        if(dp[i+1][j-1]==1){
                             dp[i][j]=1;
                             count++;
                        }
                    }
                }
                i++;
                j++;

            }
        }

        return count;
    }
}
 
