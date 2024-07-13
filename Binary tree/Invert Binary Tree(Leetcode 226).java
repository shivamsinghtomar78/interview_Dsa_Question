/*
Approach-1:Dfs
Time Complexity (TC):O(n)
n = number of nodes in the tree
Space Complexity (SC):O(h)
h = height of the tree
Worst case: O(n) for a completely unbalanced tree
Best case: O(log n) for a perfectly balanced tree  
  */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        if(root.left==null && root.right==null) return root;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invert(root.left);
        invert(root.right);
        return root;
    }
}
