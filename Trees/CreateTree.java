import java.util.Scanner;

class Node{
    int data;
    Node left = null;
    Node right = null;
    Node(int data){
        this.data = data;
    }
}

public class CreateTree{
    static Node createNode(int data){
        Node newnode = new Node(data);
        return newnode;
    }

    static Node insertNode(Node root){
        Scanner input = new Scanner(System.in);

        int data = input.nextInt();
        Node newnode = createNode(data);
        root = newnode;

        data = input.nextInt();
        Node leftnewnode = createNode(data);
        root.left = leftnewnode;

        data = input.nextInt();
        Node rightnewnode = createNode(data);
        root.right = rightnewnode;
        return root;
    }

    static void inOrder(Node root){
        // System.out.println("In order traversal");
        if(root !=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+ " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    static void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args){
        Node root = null;
        root = insertNode(root);
        System.out.println("In Order traversal");
        inOrder(root);
        System.out.println();

        System.out.println("Pre Order Traversal ");
        preOrder(root);
        System.out.println();

        System.out.println("Post Order Traversal ");
        postOrder(root);
        System.out.println();

    }
}