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


/*
Approach-2:DFS
Time complexity:O(n);
Space complexity:O(n); */


class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int [] diameter=new int [1];
        height(root,diameter);
        return diameter[0];
    }
    private int height(TreeNode Node,int[] diameter){
        if(Node==null) return 0;
        int lh=height(Node.left,diameter);
        int rh=height(Node.right,diameter);
        diameter[0]=Math.max(diameter[0],lh+rh);
        return 1+Math.max(lh,rh);
    }
}
