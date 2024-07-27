/*
Approach-1:DFS
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public TreeNode bstToGst(TreeNode root) {
        List<TreeNode> arr=new ArrayList<>();
        inorder(root,arr);
        int n=arr.size();
        for(int i=n-2;i>=0;i--){
            arr.get(i).val+=arr.get(i+1).val;
        }
        return root;

    }
    public void inorder(TreeNode root,List<TreeNode> arr){
        if(root==null) return ;
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
    }
}
/*
Approach-2:DFS
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    static int sum;
    public TreeNode convertBST(TreeNode root) {
        sum=0;
        reverseInorder(root);
        return root;
    }
    public void reverseInorder(TreeNode root){
        if(root==null) return;
        reverseInorder(root.right);
        root.val+=sum;
        sum=root.val;
        reverseInorder(root.left);
    }

}
