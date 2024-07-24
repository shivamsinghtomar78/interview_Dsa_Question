/*
Approach-1:Recursion
Time complexity:O(Log(N));
Space complexity:O(1);
*/

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val<val) return searchBST(root.right,val);
        else if(root.val>val) return searchBST( root.left, val);
        else return root;
       
}
}
