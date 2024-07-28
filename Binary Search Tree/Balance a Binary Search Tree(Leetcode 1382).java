/*
Approach-1:Binary search
Time complexity:O(N);
Space complexity:O(N);
*/

class Solution {
    public TreeNode balanceBST(TreeNode root) {
        // Step 1: Create an ArrayList to store the node values
        List<Integer> arr = new ArrayList<>();
        
        // Step 2: Perform inorder traversal to get sorted array
        inorder(root, arr);
        
        int n = arr.size();
        
        // Step 3: Build balanced BST from sorted array
        return helper(arr, 0, n-1);
    }
    
    // Inorder traversal to get sorted array
    public void inorder(TreeNode root, List<Integer> arr) {
        if (root == null) return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
    
    // Recursive helper function to build balanced BST
    public TreeNode helper(List<Integer> arr, int lo, int hi) {
        if (lo > hi) return null;
        
        // Find the middle element
        int mid = (lo + hi) / 2;
        
        // Create a new node with the middle element
        TreeNode root = new TreeNode(arr.get(mid));
        
        // Recursively build left and right subtrees
        root.left = helper(arr, lo, mid-1);
        root.right = helper(arr, mid+1, hi);
        
        return root;
    }
}
