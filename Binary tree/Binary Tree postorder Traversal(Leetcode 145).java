/*
Approach-1:Recursive postorder Traversal(DFS)
Time complexity:O(n);
space complexity:O(n) */

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result =new ArrayList<>();
        postorder(root,result);
        return result;
        
    }
    public void postorder(TreeNode root,List<Integer> result){
        if(root==null) return ; 
        postorder(root.left,result);
        postorder(root.right,result);
        result.add(root.val);
    }
}

/*
Approach-2: iterative using one stack(BFS)
Time complexity:O(n);
space complexity:O(n) */

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        // 4 5 2 6 7 3 1
        //finding the reverse  preOrder then reverse the reverse preOrder
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null)
            st.push(root);
        while (st.size() > 0) {
            TreeNode top = st.pop();
            ans.add(top.val);
            if (top.left != null)
                st.push(top.left);
            if (top.right != null)
                st.push(top.right);

        }
        Collections.reverse(ans);
        return ans;
    }
}
