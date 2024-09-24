/*
Approach: Binary tree;
Time complexity:O(N);
Space complexity:O(H); */


class Solution {
    int pathLength = 0;
    private void dfs(TreeNode node, boolean goLeft, int steps) {
        if (node == null) {
            return;
        }
        pathLength = Math.max(pathLength, steps);
        if (goLeft) {
            dfs(node.left, false, steps + 1);
            dfs(node.right, true, 1);
        } else {
            dfs(node.left, false, 1);
            dfs(node.right, true, steps + 1);
        }
    }

    public int longestZigZag(TreeNode root) {
        dfs(root, false, 0);
        dfs(root, true, 0);
        return pathLength;
    }
}

/*
Approach: Binary tree;
Time complexity:O(N);
Space complexity:O(H); */


class Solution {
    private int maxPath = 0;
    
    public int longestZigZag(TreeNode root) {
        solve(root, 0, 0);
        return maxPath;
    }
    
    private void solve(TreeNode root, int left, int right) {
        if (root == null) {
            return;
        }
        
        maxPath = Math.max(maxPath, Math.max(left, right));
        
        solve(root.left, right + 1, 0);
        solve(root.right, 0, left + 1);
    }
}
