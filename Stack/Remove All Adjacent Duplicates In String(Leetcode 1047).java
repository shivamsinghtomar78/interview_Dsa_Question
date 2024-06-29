/* 
Approach -1:iterative method
T.c :O(n);
S.c :O(n);
Algo:
1. It uses a stack to keep track of characters.
2. It iterates through each character in the input string.
3. If the stack is empty or the current character is different from the top of the stack, it pushes the character onto the stack.
4. If the current character is the same as the top of the stack, it pops the top character off the stack (removing the adjacent duplicate).
5. After processing all characters, it builds a new string from the remaining characters in the stack.
6. Finally, it reverses this string to maintain the original order and returns the result. */

class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(st.isEmpty() || c!=st.peek()){
                st.push(c);
            }
            else if(c==st.peek()){
                st.pop();
            }
        }
        StringBuilder ans=new StringBuilder();
         while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        
        return ans.reverse().toString();

        
    }
}

 
