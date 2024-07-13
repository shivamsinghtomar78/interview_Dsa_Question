/*
Approach-1:Recursive postorder Traversal
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
