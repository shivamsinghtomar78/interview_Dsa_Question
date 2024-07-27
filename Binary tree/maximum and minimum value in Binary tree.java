// code for maximum value 
package binaryTree;

public class NodeWithMaxValue_5 {
    public static void main(String[] args) {
        Node a=new Node(1);// a is the root
        Node b=new Node(41);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(5);
        Node g=new Node(100);
        Node h=new Node(20);
        // connecting
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f; c.left=g;
        e.right=h;
        int max=maximum(a);
        System.out.println("Maximum value of the Node : "+max);
    }
    private static int maximum(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a=maximum(root.left);
        int b=maximum(root.right);
        int c=root.val;
        return Math.max(c,Math.max(a,b));



    }
}




// Code for minimum value 


package binaryTree;

public class NodeWithMinValue_6 {
    public static void main(String[] args) {
        Node a=new Node(1);// a is the root
        Node b=new Node(41);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(5);
        Node g=new Node(100);
        Node h=new Node(20);
        // connecting
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f; c.left=g;
        e.right=h;
        int min=minimum(a);
        System.out.println("Maximum value of the Node : "+min);
    }
    private static int minimum(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a=minimum(root.left);
        int b=minimum(root.right);
        int c=root.val;
        return Math.min(c,Math.min(a,b));
    }
}
