/*
Approach -1:DFS
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        int a=levels(root.left);
        int b=levels(root.right);
        return 1+Math.max(a,b);
    }
    // conditions for balanced treee:
    // |levelOfLeft-levelOfRight|<=1
    
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int diff=Math.abs(levels(root.left)-levels(root.right));
        if(diff>1) return false;
        return  isBalanced(root.left) && isBalanced(root.right);

    }
}


/*
Approach -2:DFS(Optimal)
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    static boolean ans;
    public int levels(TreeNode root){
        if(root==null) return 0;
        int a=levels(root.left);
        int b=levels(root.right);
        int diff=Math.abs(a-b);
        if(diff>1) ans=false;
        return 1+Math.max(a,b);
    }
    // conditions for balanced treee:
    // |levelOfLeft-levelOfRight|<=1
    
    public boolean isBalanced(TreeNode root) {
       ans=true;
       levels(root);
       return ans;
       

    }
}
