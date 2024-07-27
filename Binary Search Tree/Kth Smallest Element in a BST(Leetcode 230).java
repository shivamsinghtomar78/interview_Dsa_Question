/*
Approach-1:DFS 
Time complexity:O(N);
Space complexity:O(N);
problem in gfg:https://www.geeksforgeeks.org/problems/find-k-th-smallest-element-in-bst/1
*/

class Solution {
    public int kthSmallest(TreeNode root, int k) {
    ArrayList<Integer> arr=new ArrayList();
     inorder(root,k,arr);
       if (k > 0 && k <= arr.size()) {
            return arr.get(k - 1);
        }
        return -1
    }
    public void inorder(TreeNode root,int k,List<Integer> arr){
         if(root==null) return;
         inorder(root.left,k,arr);
         arr.add(root.val);
        inorder(root.right,k,arr);

    }
}
