import java.util.Queue;
import java.util.LinkedList;

class Node{
    int data;
    Node left = null;
    Node right = null;
    Node(int data){
        this.data = data;
    }
}

public class LevelOrderTraversal{

    static Node createNode(int data){
        Node newnode = new Node(data);
        return newnode;
    }

    static void levelorder(Node root){
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print(temp.data +" ");

            if(temp.left !=null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
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

        levelorder(root);
    }
}