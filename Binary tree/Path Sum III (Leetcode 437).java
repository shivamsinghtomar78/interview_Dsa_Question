/*
Approach-1:DFS
Time complexity:O(N);
Space complexity:O(N);*/

class Solution {
    public int pathSum(TreeNode root, int  Sum) {
        if(root==null) return 0;
        return helper(root,Sum)+ pathSum(root.left,Sum)+ pathSum(root.right,Sum);
    }
    public int helper(TreeNode root,long Sum){
        if(root==null) return 0;
        int count=0;
        if(root.val==Sum) count++;
        count += helper(root.left,Sum-root.val)+ helper(root.right,Sum-root.val);
        return count;
    }
}
