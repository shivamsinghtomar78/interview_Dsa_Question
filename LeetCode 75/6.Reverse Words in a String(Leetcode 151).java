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


/*
Approach: Two poiner;
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        
        // 1. Reverse the whole string
        reverse(charArray, 0, charArray.length - 1);
        
        int i = 0;
        int l = 0, r = 0;
        int n = charArray.length;
        
        while (i < n) {
            // Move non-space characters
            while (i < n && charArray[i] != ' ') {
                charArray[r] = charArray[i];
                r++;
                i++;
            }
            
            if (l < r) {
                // Reverse the word
                reverse(charArray, l, r - 1);
                
                // Add a space after the word
                if (r < n) {
                    charArray[r++] = ' ';
                }
                
                l = r;
            }
            
            i++;
        }
        
        // Trim the trailing spaces
        while (r > 0 && charArray[r - 1] == ' ') {
            r--;
        }
        
        return new String(charArray, 0, r);
    }
    
    private void reverse(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
