/*
Approach-1:DFS
Time complexity:O(n);
Space complexity:O(n); */


class Solution {
    public boolean isSymmetric(TreeNode root) {
      if(root==null) return true;
      return check(root.left,root.right);
    }
    boolean check(TreeNode l,TreeNode r){
        if(l==null && r==null) return true;
         if(l==null || r==null) return false;
         if(l.val==r.val && check(l.left,r.right) && check(l.right,r.left)) return true;
         return false;
    }
}
