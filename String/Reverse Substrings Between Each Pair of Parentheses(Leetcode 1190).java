/*
Approach-1:Using Stack and StringBuilder
Time complexity:O(n^2)
Space complexity:O(n)  */

class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == ')') {
                StringBuilder helper = new StringBuilder();
                while(!st.isEmpty() && st.peek() != '(') {
                    helper.append(st.pop());
                }
                if(!st.isEmpty()) {
                    st.pop(); // Remove the '('
                }
                for(int j = 0; j < helper.length(); j++) {
                    st.push(helper.charAt(j));
                }
            } else {
                st.push(s.charAt(i));
            }
        }
        
        while(!st.isEmpty()) {
            ans.append(st.pop());
        }
        
        return ans.reverse().toString();
    }
}

