/*
Approach: Three poiner;
Time complexity:O(M+N);
Space complexity:O(M+N); */

class Solution {
    public String mergeAlternately(String a, String b) {
        int m=a.length();
        int n=b.length();
        int i=0;
        int j=0;
        int z=0;
        StringBuilder ans=new StringBuilder();
        while(i<m && j<n){
            if(z%2==0){
                ans.append(a.charAt(i));
                i++;
            }
            else{
                ans.append(b.charAt(j));
                j++;
            }
            z++;
        }
        if(i<m){
            while(i<m){
                ans.append(a.charAt(i));
                i++;
            }
        }
        if(j<n){
            while(j<n){
                ans.append(b.charAt(j));
                j++;
            }
        }
        return ans.toString();
    }
}
