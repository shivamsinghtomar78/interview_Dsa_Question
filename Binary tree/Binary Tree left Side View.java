/*
Approach-1:DFS
Time complexity:O(N);
Space complexityO(N); 
Problem :https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1  
*/



/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    public static int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
     int n=levels(root);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(0);
        }
        preOrder(root,0,ans);
        return ans;
    }
    public void preOrder(Node root,int level, List<Integer> ans){
        if(root==null) return ;
        ans.set(level,root.data);
         preOrder(root.right,level+1,ans);
        preOrder(root.left,level+1,ans);
        
    }
}
