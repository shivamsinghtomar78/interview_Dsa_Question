/*
Approach-1:DFS
Time complexity:O(N)
space compplexity:O(N) */

  class Solution {
    static int n;
    public List<List<Integer>> levelOrder(TreeNode root) {
        int m=levels(root);
        List<List<Integer>> ans= new ArrayList<>();
        for(int x=0;x<m;x++){
            n=x;
            List<Integer> helper=new ArrayList<>();
            nThLevel(root,0,helper);
            ans.add(helper);
        }
        return ans;
    }
    private static void nThLevel(TreeNode root,int level,List<Integer> helper){
        if(root==null) return ;
        if(level==n) helper.add(root.val);
         nThLevel(root.left,level+1,helper);
        nThLevel(root.right,level+1,helper);
    }
    private static int levels(TreeNode root){
        if(root==null) return 0;
        int a=levels(root.left);
        int b=levels(root.right);
        return 1+Math.max(a,b);
    }
}
