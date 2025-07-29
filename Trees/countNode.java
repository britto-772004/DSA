class Node{
    int data ;
    Node left = null;
    Node right = null;
    Node(int data){
        this.data = data;
    }
}

public class countNode{
    static Node createNode(int data){
        Node newnode = new Node(data);
        return newnode;
    }

    static int countnode(Node root){
        if(root == null){
            return 0;
        }
        return 1 + countnode(root.left) + countnode(root.right);
    }
    public static void main(String[] args){
        Node root = null;
        root = createNode(1);
        root.left = createNode(2);
        root.right = createNode(3);
        root.left.left = createNode(4);
        root.left.right = createNode(5);
        root.right.left = createNode(6);
        root.right.right = createNode(7);
        root.right.left.left = createNode(8);
        System.out.println(countnode(root));
    }
}