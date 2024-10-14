/*Time complexity:O(n);
Space complexity:O(n);*/
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
