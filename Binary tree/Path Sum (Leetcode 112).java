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

/*
Approach-2:DFS
Time complexity:O(N);
Space complexity:O(H); */


class Solution {
    boolean inOrder (TreeNode root,int sum,int targetSum){
        if(root==null) return false;
        sum+=root.val;
        // if we reached leaf Node
        if(root.left==null && root.right==null){
            if(sum==targetSum) return true;
            return false;
        }
        boolean leftSide=inOrder(root.left,sum,targetSum);
        boolean rightSide=inOrder(root.right,sum,targetSum);
        return leftSide || rightSide;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        boolean result=inOrder(root,sum,targetSum);
        return result;
    }
}
