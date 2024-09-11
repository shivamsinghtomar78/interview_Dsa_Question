/*
Approach: Two poiner;
Time complexity:O(N+M^2);
Space complexity:O(N); */

class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        List<String> helper=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n && j<n){
            if(s.charAt(i)==' '){
                i++;
                j++;
                continue;
            }
            while(j<n && s.charAt(j)!=' ') j++;
            helper.add(s.substring(i,j));
            i=j;
            if(i<n && j<n) helper.add(" ");
        }
        String ans="";
        int m=helper.size();
        for(int k=m-1;k>=0; k--){

            if(k==m-1){
                 if(helper.get(k)==" ") continue;
            }
            ans+=helper.get(k);
        }
        return ans;
    }
}

