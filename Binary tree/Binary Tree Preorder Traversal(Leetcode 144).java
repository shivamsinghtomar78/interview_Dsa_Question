/*
Approach-1:Recursive Preorder Traversal(DFS)
Time complexity:O(n);
space complexity:O(n) */
  
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        preorder(root,result);
        return result;
    }
     public void preorder(TreeNode root,List<Integer> result){
        if(root==null) return ;
        result.add(root.val);
        preorder(root.left,result);
        preorder(root.right,result);
     }
    
}
/*
Approach-2:iterative Preorder Traversal(BFS)
Time complexity:O(n);
space complexity:O(n) */

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null)
            st.push(root);
        while (st.size()> 0) {
            TreeNode top = st.pop();
            ans.add(top.val);
            if (top.right != null)
                st.push(top.right);
            if (top.left != null)
                st.push(top.left);
        }
        return ans;
    }
}
