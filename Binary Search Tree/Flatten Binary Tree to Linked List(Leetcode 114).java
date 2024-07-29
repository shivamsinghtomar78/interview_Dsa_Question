/*
Approach-1:Preorder traversal adding value in list;
Time complexity:O(N);
Space complexity:O(N);
*/

class Solution {
    public void flatten(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return;
        
        List<TreeNode> nodes = new ArrayList<>();
        preorder(root, nodes);
        
        for (int i = 1; i < nodes.size(); i++) {
            root.left = null;
            root.right = nodes.get(i);
            root = root.right;
        }
    }
    
    public void preorder(TreeNode root, List<TreeNode> nodes) {
        if (root == null) return;
        nodes.add(root);
        preorder(root.left, nodes);
        preorder(root.right, nodes);
    }
}
