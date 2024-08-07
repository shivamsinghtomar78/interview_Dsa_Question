/*
Approach-1:DFS
Time complexity:O(N);
Space complexity:O(N);  */

class Solution {
    public boolean isValidBST(TreeNode root) {
       if(root==null) return true;
       if(root.val<=max(root.left)) return false;
       if(root.val>=min(root.right)) return false;
       return  isValidBST(root.left) && isValidBST( root.right);
    }
    private long max(TreeNode root){
        if(root==null) return Long.MIN_VALUE;
        long a=root.val;
        long b=max(root.left);
        long c=max(root.right);
        return Math.max(a,Math.max(b,c));
    }
      private long min(TreeNode root){
        if(root==null) return Long.MAX_VALUE;
        long a=root.val;
        long b=min(root.left);
        long c=min(root.right);
        return Math.min(a,Math.min(b,c));
    }
}

/*
Approach-2:DFS
Time complexity:O(N);
Space complexity:O(N);  */

class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> arr=new ArrayList();
        inorder(root,arr);
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>=arr.get(i+1)) return false;
        }
        return true;
    }
    public void inorder(TreeNode root, List<Integer> arr){
        if(root==null) return ;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}
/*
Approach-3:DFS
Time complexity:O(N);
Space complexity:O(N);  */


class Solution {
    static boolean flag;
    public boolean isValidBST(TreeNode root) {
        flag=true;
        max(root);
        min(root);
        return flag;
    }
    private long max(TreeNode root){
        if(root==null) return Long.MIN_VALUE;
        long leftMax=max(root.left);
        if(leftMax>=root.val) flag=false;
        long rightMax=max(root.right);
        return Math.max(root.val,Math.max(leftMax,rightMax));
    }
      private long min(TreeNode root){
        if(root==null) return Long.MAX_VALUE;
        long leftMin=min(root.left);
        long rightMin=min(root.right);
        if(rightMin<=root.val) flag=false;
        return Math.min(root.val,Math.min(leftMin,rightMin));
    }
}


