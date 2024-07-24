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

/*
Approach-2:BST(concept);
Time complexity: O(n)
Space complexity: O(1)  */

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        // Within Range
        if (root.val >= low && root.val <= high) {
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }

        // When outside the range (Less than low) - Go right
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }

        // When outside the range (Greater than high) - Go left
        return rangeSumBST(root.left, low, high);
    }
}

