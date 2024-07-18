/*
Approach-1:DFS
Time complexity:O(N);
Space complexity:O(H); */


class Solution {
    public boolean pathSum(TreeNode root, int sum, int targetSum) {
        if (root == null) return false;
        sum += root.val;
        if (root.left == null && root.right == null) {
            return sum == targetSum;
        }
        return pathSum(root.left, sum,  targetSum) || 
               pathSum(root.right, sum,  targetSum);
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSum(root, 0, targetSum);
    }
}
