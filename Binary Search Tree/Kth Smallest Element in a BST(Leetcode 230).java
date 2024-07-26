/*
Approach-1:DFS 
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
    ArrayList<Integer> arr=new ArrayList();
     inorder(root,k,arr);
      return arr.get(k-1);  
    }
    public void inorder(TreeNode root,int k,List<Integer> arr){
         if(root==null) return;
         inorder(root.left,k,arr);
         arr.add(root.val);
        inorder(root.right,k,arr);

    }
}
