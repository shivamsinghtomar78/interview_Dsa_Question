//Approach -1:iterative method 
// T.c:O(n);
// S.c :O(n);

class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else{
               if (st.isEmpty()) return false;
                if (c == ')' && st.peek() != '(') return false;
                if (c == '}' && st.peek() != '{') return false;
                if (c == ']' && st.peek() != '[') return false;
                st.pop();
            }
        }
        return st.isEmpty();
        
    }
}

//Approach -2:iterative method and tricky
// T.c:O(n);
// S.c :O(n);

class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(')');
            }
            else if(c=='{'){
                st.push('}');
            }
            else if(c=='['){
                st.push(']');
            }
            else if(st.isEmpty() || st.peek()!=c){
                return false;
            }
            else{
                st.pop();
            }
             
        }
        return st.isEmpty();
        
    }
}

