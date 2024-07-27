/*
Approach-1:DFS 
Time complexity:O(N);
Space complexity:O(N);
problem in gfg:https://www.geeksforgeeks.org/problems/kth-largest-element-in-bst/1
*/


class Solution {
    // Return the Kth largest element in the given BST
    public int kthLargest(Node root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        reverseInorder(root, arr);
        
        if (k > 0 && k <= arr.size()) {
            return arr.get(k - 1);
        }
        return -1;  // Return -1 if k is out of bounds
    }
    
    private void reverseInorder(Node root, List<Integer> arr) {
        if (root == null) return;
        reverseInorder(root.right, arr);
        arr.add(root.data);
        reverseInorder(root.left, arr);
    }
}
