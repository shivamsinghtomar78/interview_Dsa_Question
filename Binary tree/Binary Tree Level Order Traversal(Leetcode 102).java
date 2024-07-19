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


/*
Approach-2:BFS
Time complexity:O(N)
space compplexity:O(N) */


class Solution {
    private int levels(TreeNode root){
        if(root==null) return 0;
        int a=levels(root.left);
        int b=levels(root.right);
        return 1+Math.max(a,b);
    }
    public static class  pair{
        TreeNode node;
        int level;
        pair(TreeNode node ,int level){
            this.node=node;
            this.level=level;
        }
    }
     private  void BFS(TreeNode root, List<List<Integer>> ans){
        Queue<pair> q=new LinkedList<>();
        if(root!=null) q.add( new pair(root,0));
        while(q.size()>0){
            pair front=q.remove();
            TreeNode temp=front.node;
            int lvl=front.level;
          ans.get(lvl).add(temp.val);
            if(temp.left!=null) q.add(new pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new pair(temp.right,lvl+1));
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        int lvl=levels(root);
        for(int i=0;i<lvl;i++){
            List<Integer> arr=new ArrayList<>();
            ans.add(arr);
            
            
        }
         BFS(root,ans);
         return ans;
    }
}
