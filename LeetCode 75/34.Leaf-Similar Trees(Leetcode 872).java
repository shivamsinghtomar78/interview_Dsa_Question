/*
Approach: Binary tree;
Time complexity:O(N);
Space complexity:O(h); */


class Solution {
    public void leaf(List<Integer> helper,TreeNode root){
        if(root==null) return ;
        if(root.left==null && root.right==null){
            helper.add(root.val);
            return;
        }
        leaf(helper,root.left);
        leaf(helper,root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> helper1=new ArrayList<>();
        List<Integer> helper2=new ArrayList<>();

        leaf(helper1,root1);
        leaf(helper2,root2);

       Integer[] array1 = helper1.toArray(new Integer[0]);
        Integer[] array2 = helper2.toArray(new Integer[0]);
        
        // Compare the arrays
        return Arrays.equals(array1, array2);
    }
}
