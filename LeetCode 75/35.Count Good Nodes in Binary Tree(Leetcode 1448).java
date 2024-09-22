/*
Approach: Binary tree;
Time complexity:O(N);
Space complexity:O(N); */


class Solution {
    public int  good(int count ,TreeNode root,int mx){
        if(root==null) return 0;
        count=(root.val >= mx) ? 1 : 0;
        mx = Math.max(mx, root.val);
      int a=  good(count,root.left,mx);
      int b=  good(count,root.right,mx);
      return count+a+b;

    }
    public int goodNodes(TreeNode root) {
        return good(0,root,root.val);

    }
}
