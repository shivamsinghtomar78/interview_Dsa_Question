/*
Approach-1:Using Stack and StringBuilder(brute force)
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

/*
Approach-2:Using Stack and StringBuilder(burte force)
Time complexity:O(n^2)
Space complexity:O(n)  */
class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> openBracket=new Stack<>();
        StringBuilder result=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='(') openBracket.push(result.length());
            else if(ch==')'){
                int start=openBracket.pop();
                reverse(result,start,result.length()-1);
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
    private void reverse(StringBuilder sb,int start,int end){
        while(start<end){
            char temp=sb.charAt(start);
            sb.setCharAt(start++,sb.charAt(end));
            sb.setCharAt(end--,temp);
        }
    }
}
