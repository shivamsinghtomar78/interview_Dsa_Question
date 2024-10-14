/*Time complexity:O(n);
Space complexity:O(n);
Problem :https://www.geeksforgeeks.org/problems/flatten-bst-to-sorted-list--111950/1
*/
class Solution {
    public void sorted(Node root, List<Integer> arr){
        if(root==null) return;
        sorted(root.left,arr);
        arr.add(root.data);
        sorted(root.right,arr);
    }
    public Node flattenBST(Node root) {
      List<Integer> helper=new ArrayList<>();
      sorted(root,helper);
      int n=helper.size();
      Node ans=new Node(helper.get(0));
      Node temp=ans;
      for(int i=1;i<n;i++){
           Node node=new Node(helper.get(i));
           temp.left=null;
           temp.right=node;
           temp=temp.right;
          
      }
      temp.left=null;
      temp.right=null;
      return ans;
      
    }
}



//T.C : O(n)
//S.C : AUxiliary Space is O(1) and Stack Space due to recursion is O(n)

class Solution {
    public Node flattenBST(Node root) {
        if (root == null) {
            return null;
        }

        Node head = flattenBST(root.left);
        root.left = null;
        root.right = flattenBST(root.right);

        if (head != null) {
            Node temp = head;
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = root;
        } else {
            // If head is null, root becomes the head
            head = root;
        }

        return head;
    }
}
