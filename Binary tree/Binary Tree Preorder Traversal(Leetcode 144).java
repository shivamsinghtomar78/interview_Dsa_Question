/*
Approach-1:Recursive Preorder Traversal
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
