

class Node
{
    int data;
    Node left,right;
    public Node(int x)
    {
       data = x;
       left = null;
       right = null;
       
    }
    
    
}
class BinaryTree
{
    Node root;
    public BinaryTree()
    {
        root = null;
    }
    void inorder(Node node)
    {
        if(node==null)
            return;
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
        
        
    }
    void printin()
    {
        inorder(root);
    }
    public static void main(String[]args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(3);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.left.right = new Node(8);
        tree.root.left.right.left.right.left = new Node(9);
        tree.root.left.right.left.right.right = new Node(10);
        System.out.println("Inorder printing");
        tree.printin();
        
    }
    
}
