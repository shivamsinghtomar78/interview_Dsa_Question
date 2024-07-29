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


/*
Approach-3:Using Morris Traversal;
Time complexity:O(n);
space complexity:O(1) */


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred=curr.left;
                while(pred.right!=null && pred.right!=curr) pred=pred.right;
                
                if(pred.right==null){//link
                pred.right=curr;
                curr=curr.left;
                }
                else{//pred.right=curr:unlink
                pred.right=null;
                ans.add(curr.val);
                curr=curr.right;

                }
            }
            else{
                ans.add(curr.val);
                curr=curr.right;
            }
        }
        return ans;
    }
}

