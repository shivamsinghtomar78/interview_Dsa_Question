/*Time Complexity: O(n)
Space Complexity: O(n)*/


  class Solution {
    public static int[] calculateSpan(int price[], int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            
            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }
            
            st.push(i);
        }
        
        return ans;
    }
}
