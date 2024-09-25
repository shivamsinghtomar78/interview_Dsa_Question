/*
Approach: Binary tree;
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public boolean exists(TreeNode root, TreeNode node) {
        if (node == root)
            return true;
        if (root == null)
            return false;
        return exists(root.left, node) || exists(root.right, node);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p == root || q == root)
            return root;
        boolean pLieInLST = exists(root.left, p);
        boolean qLieInLST = exists(root.left, q);
        if (pLieInLST == true && qLieInLST == true)
            return lowestCommonAncestor(root.left, p, q);
        if (pLieInLST == false && qLieInLST == false)
            return lowestCommonAncestor(root.right, p, q);
        else
            return root;
    }
}
