/*
Approach-1:DFS
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public void path (TreeNode root ,String s,List<String> ans){
        if(root==null) return ;
        if(root.left==null && root.right==null){
            s+=root.val;
            ans.add(s);
            return;
        }
        path(root.left,s+root.val+"->",ans);
        path(root.right,s+root.val+"->",ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        path(root,"",ans);
        return ans;
    }
}
