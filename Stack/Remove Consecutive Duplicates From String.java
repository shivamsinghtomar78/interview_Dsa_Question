//Approach-1: store all non-duplicate in stack and convert in StringBuilder then reverse stringBuilder then convert stringBuilder in string
// T.c:O(n);
// S.c :O(n);
// Problem link: https://www.naukri.com/code360/problems/remove-consecutive-duplicates-from-string_630473
 
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
