/*
Approach: Binary tree;
Time complexity:O(N);
Space complexity:O(h); */

class Solution {
    public int lvl(TreeNode root){
        if(root==null) return 0;
        int a=lvl(root.left);
        int b=lvl(root.right);
        return  1+Math.max(a,b);
    }
    public int maxDepth(TreeNode root) {
        return lvl(root);
    }
}
