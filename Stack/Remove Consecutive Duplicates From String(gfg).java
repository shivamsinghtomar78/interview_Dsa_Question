 /* Approach-1: store all non-duplicate in stack and convert in StringBuilder then reverse stringBuilder then convert stringBuilder in string
  T.c:O(n);
  S.c :O(n);
  Problem link: https://www.naukri.com/code360/problems/remove-consecutive-duplicates-from-string_630473
  Algo:1. It uses a Stack to process the characters.
2. It iterates through the input string, character by character.
3. For each character, it checks if the stack is empty or the current character is different from the top of the stack.
4. If either condition is true, it pushes the character onto the stack.
5. After processing all characters, it pops the characters from the stack and appends them to a StringBuilder.
6. Finally, it reverses the StringBuilder and returns the resulting string.
 */


 
import java.util.Stack;

public class Solution {
    public static String removeConsecutive(StringBuilder str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (st.isEmpty() || c != st.peek()) {
                st.push(c);
            }
        }
        
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        
        return ans.reverse().toString();
    }
}
