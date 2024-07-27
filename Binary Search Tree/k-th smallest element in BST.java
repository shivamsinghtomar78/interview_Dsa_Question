/*
Approach-1:DFS 
Time complexity:O(N);
Space complexity:O(N);
problem in gfg:https://www.geeksforgeeks.org/problems/kth-largest-element-in-bst/1
*/


class Solution {
    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        
        if (k > 0 && k <= arr.size()) {
            return arr.get(k - 1);
        }
        return -1;  // Return -1 if k is out of bounds
    }
    
    private void inorder(Node root, List<Integer> arr) {
        if (root == null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
}
