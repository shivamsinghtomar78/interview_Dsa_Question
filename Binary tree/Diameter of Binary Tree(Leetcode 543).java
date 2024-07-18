/*
Approach-1:DFS
Time complexity:O(n);
Space complexity:O(n); */

 
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int myDia=levels(root.left)+levels(root.right);
        int leftDia=diameterOfBinaryTree(root.left);
        int rightDia=diameterOfBinaryTree(root.right);
        return Math.max(myDia,Math.max(leftDia,rightDia));
    }
    public int levels(TreeNode root){
        if(root==null) return 0;
        int a=levels(root.left);
        int b=levels(root.right);
        return 1+Math.max(a,b);
    }
}
