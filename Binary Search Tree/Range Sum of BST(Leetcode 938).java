/*
Approach-1:DFS
Time complexity:O(N);
Space complexity:O(N);  */

class Solution {
    public int rangeSumBST(TreeNode root, int lo, int hi) {
        if(root==null) return 0;
        int sum=rangeSumBST(root.left,lo,hi)+rangeSumBST(root.right,lo,hi);
        if(root.val>=lo && root.val<=hi) sum+=root.val;
        return sum;    }
}

