/*
Approach-1:DFS
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public static int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public List<Integer> rightSideView(TreeNode root) {
        int n=levels(root);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(0);
        }
        preOrder(root,0,ans);
        return ans;
    }
    public void preOrder(TreeNode root,int level, List<Integer> ans){
        if(root==null) return ;
        ans.set(level,root.val);
        preOrder(root.left,level+1,ans);
        preOrder(root.right,level+1,ans);
    }
}

