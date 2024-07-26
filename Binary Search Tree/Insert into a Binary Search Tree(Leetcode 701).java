/*
Approach-1:Recursion
Time complexity:O(Log(N))
Space complexity:O(Log(N)) */

  class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        } else {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
}


/*
Approach-1:Recursion
Time complexity:O(H)
Space complexity:O(H) */

 class Solution {
    public void insert(TreeNode root,int val){
        if(val<root.val){
            if(root.left==null) root.left=new TreeNode(val);
            else insert(root.left,val);
        }
         if(val>root.val){
            if(root.right==null) root.right=new TreeNode(val);
            else insert(root.right,val);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
       if(root==null) return new TreeNode(val);
       insert(root,val);
       return root; 
    }
}
