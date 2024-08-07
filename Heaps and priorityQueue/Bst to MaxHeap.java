/*
Appraoch-1:using inorder and preorder traversal in reverse;
Time complexity:O(N^2);
Space complexity:O(N);
Problem:https://www.geeksforgeeks.org/problems/bst-to-max-heap/1
*/

class Solution
{
    public static void convertToMaxHeapUtil(Node root)
    {
       List<Integer> helper=new ArrayList<>();
       inorder(root,helper);
       preorder(root,helper);
       
    }
    private static  void inorder(Node root, List<Integer> helper){
        if(root==null) return;
        inorder(root.right,helper);
        helper.add(root.data);
        inorder(root.left,helper);
      
    }
   private static void preorder(Node root,List<Integer> helper){
        if(root==null) return;
        root.data=helper.remove(0);
        preorder(root.right,helper);
        preorder(root.left,helper);
         
    
    }
}
