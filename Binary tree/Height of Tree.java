// code for calculate height of the Tree.
public class levelOfBinaryTree_8 {
    public static void main(String[] args) {
        Node a=new Node(1);// a is the root
        Node b=new Node(41);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(5);
        Node g=new Node(10);
        Node h=new Node(20);
        // connecting
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f; c.left=g;
        e.right=h;
        int level=levelOfTree(a);
        System.out.println("Level of the Binary tree: "+level);
    }
    private static int levelOfTree(Node root){
        if(root==null) return 0;
        int a=levelOfTree(root.left);
        int b=levelOfTree(root.right);
        return 1+Math.max(a,b);
    }
}
