/*
Approach-1:Stack
Time complexity:O(n);  
Time complexity:O(n);  */

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int z = 0;
        
        // NGE calculation 
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        st.push(n-1);
        nge[n-1] = n;
        for(int i = n-2; i >= 0; i--) {
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]) st.pop();
            if(st.isEmpty()) nge[i] = n;
            else {
                nge[i] = st.peek();
            }
            st.push(i);
        }
        
        //   finding maximum in each window
        for(int i = 0; i <= n-k; i++) {
            int j = i;
            while(nge[j] < i + k) {
                j = nge[j];
            }
            ans[z++] = nums[j];
        }
        
        return ans;
    }
}
