/*
Approach-1:DFS
Time complexity:O(n);
Space complexity:O(n);
*/

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


/*
Approach-2:DFS
Time complexity:O(H);
Space complexity:O(H);
*/


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root.val<p.val && root.val<q.val) return  lowestCommonAncestor(root.right, p,q);
      else if(root.val>p.val && root.val>q.val) return lowestCommonAncestor(root.left, p,q);
      else return root;
    }
}
