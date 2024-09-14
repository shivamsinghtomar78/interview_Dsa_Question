/*
Appraoch-1:using inorder and preorder traversal ;
Time complexity:O(N^2);
Space complexity:O(N);
Problem:https:https://www.naukri.com/code360/problems/convert-bst-to-min-heap_920498?leftPanelTabValue=PROBLEM
*/


public class Solution {
	public static BinaryTreeNode convertBST(BinaryTreeNode root) {
		 List<Integer> helper = new ArrayList<>();
        inorder(root, helper);  
        preorder(root, helper); 
        return root;
	}
     private static void inorder(BinaryTreeNode root, List<Integer> helper) {
        if (root == null) return;
        inorder(root.left, helper);   
        helper.add(root.data);       
        inorder(root.right, helper);  
    }

    private static void preorder(BinaryTreeNode root, List<Integer> helper) {
        if (root == null) return;
        root.data = helper.remove(0);  
        preorder(root.left, helper);   
        preorder(root.right, helper); 
    }

}



