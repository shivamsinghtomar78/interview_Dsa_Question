/*
Approach: Two pointer;
Time complexity:O(N);
Space complexity:O(1); */


class Solution {
    public boolean isSubsequence(String s, String t) {
        int m=s.length();
        int n=t.length();
        int count=0;

        int i=0;
        int j=0;
        while(i<m && j<n){
            while(j<n-1 && t.charAt(j)!=s.charAt(i))  {
                j++;
            }
            if(s.charAt(i)==t.charAt(j)) count++;
            i++;
            j++;

        }
        if(count==m) return true;
        else return false;
    }
        
}
