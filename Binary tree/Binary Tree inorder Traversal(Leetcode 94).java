/*
Approach-1:Recursive inorder Traversal(DFS)
Time complexity:O(n);
space complexity:O(n) */

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        inorder(root,result);
        return result;
    }
    public void inorder(TreeNode root,List<Integer>  result){
        if(root==null) return ;
        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
    }
}

/*
Approach-2:Using Stack(BFS);
Time complexity:O(n);
space complexity:O(n) */


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode temp=root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else{
                if(st.size()==0) break;
                TreeNode top=st.pop();
                ans.add(top.val);
                temp=top.right;
            }
        }
        return ans;
    }
}
