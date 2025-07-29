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

public class ViewsOfTree{

    static Node createNode(int data){
        Node newnode = new Node(data);
        return newnode;
    }
    
    static void leftView(Node root){
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()){
            int first = 0;
            int rear = queue.size() -1;
            int size = rear - first +1;
            for(int i=0;i< size;i++){
                Node temp = queue.poll();
                if(i==0){
                    System.out.print(temp.data+ " ");
                }
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
                
            }
            
            
        }
    }

    static void rightView(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int first = 0;
            int rear = queue.size() -1;
            int size = rear - first +1;
            for(int i=0;i<size;i++){
                Node temp = queue.poll();
                if(i== (size-1)){
                    System.out.print(temp.data+" ");
                }
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
        }
    }

    static void horizontalView(Node root){
        Queue<Node> queue = new LinkedList<>();
        System.out.println("Horizontal View");
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        System.out.println();
    }

    static void verticalView(Node root){
        
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

        System.out.println("Left view");
        leftView(root);
        System.out.println();

        System.out.println("Right view ");
        rightView(root);
        System.out.println();

        horizontalView(root);
    }
}