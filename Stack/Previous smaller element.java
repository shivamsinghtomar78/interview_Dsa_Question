class Solution {
    // Function to find the previous smaller element for each element of the array.
    public static long[] previousSmallerElement(long[] arr, int n) {
        long[] ans = new long[n];
        Stack<Long> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            
            st.push(arr[i]);
        }
        
        return ans;
    }
}
