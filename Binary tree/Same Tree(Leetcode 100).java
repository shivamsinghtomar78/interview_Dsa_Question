/*
Approach -1:using DFS
Time complexity:O(n);
Space complexity:O(n); */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val) return false;
        if(isSameTree(p.left,q.left)==false) return false;
        if(isSameTree(p.right,q.right)==false) return false;
        return true;
    }
}


//Approach-2 :(Using BFS)
//Time complexity : O(n)
//Space complexity : O(n)
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(p);
        q2.add(q);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode first = q1.poll();
            TreeNode second = q2.poll();

            if (first.val != second.val) {
                return false;
            }

            if (first.left != null && second.left != null) {
                q1.add(first.left);
                q2.add(second.left);
            } else if (first.left != null || second.left != null) {
                return false;
            }

            if (first.right != null && second.right != null) {
                q1.add(first.right);
                q2.add(second.right);
            } else if (first.right != null || second.right != null) {
                return false;
            }
        }

        return true;
    }
}
