/*
Approach-1:DFS
Time complexity:O(N):
Space complexity:O(N);  */

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int Sum) {
        List<List<Integer>> result =new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        collectionPath(root,Sum,temp,result);
        return result;
    }
    private void collectionPath(TreeNode root,int curr,List<Integer> temp,List<List<Integer>> result){
        if(root==null) return ;
        temp.add(root.val);
        if(root.left==null && root.right==null && root.val==curr){
            result.add(new ArrayList<>(temp));
        }
        collectionPath(root.left,curr-root.val,temp,result);
        collectionPath(root.right,curr-root.val,temp,result);
        temp.remove(temp.size()-1);
    }
}

