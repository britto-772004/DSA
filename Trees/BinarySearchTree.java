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

public class BinarySearchTree{
    
    static Node createNode(int data){
        Node newnode = new Node(data);
        return newnode;
    }

    // insertion 
    static Node insert(Node root,int key){
        if(root == null){
            return createNode(key);
        }
        if(key < root.data){
            root.left = insert(root.left,key);
        }
        else{
            root.right = insert(root.right,key);
        }
        return root;
    }

    // level order traversal
    static void levelorder(Node root){
        System.out.println("Level Order traversal ");
        Queue<Node> queue = new LinkedList<>();

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

    // search element in the tree
    static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left,key);
        }
            return search(root.right,key);
        
    }

    // min element in the tree
    static Node minelement(Node root){
        Node temp = root;
        while( temp.left != null){
            temp = temp.left;
        }
        return temp;
    }

    // max element in the tree
    static int maxelement(Node root){
        Node temp = root;
        while(temp != null && temp.right !=null){
            temp = temp.right;
        }
        return temp.data;
    }

    // in order in the tree
    static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    // to delete the node with single child
    static Node deleteSingleChild(Node root,int key){
        if(root == null ){
            return root;
        }
        if(root.data > key){
            root.left = deleteSingleChild(root.left,key);
        }
        else if(root.data < key){
            root.right = deleteSingleChild(root.right,key);
        }
        else{
            if(root.left == null){
                Node temp = root.right;
                return temp;
            }
            else{
                Node temp = root.left;
                return temp;
            }
        }
        return root;
    }

    static Node deleteTwoChild(Node hi,int key){
        // to reach the delete node 
        Node root = hi;
        while(root!=null && root.data != key){
            if(root.data > key){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        if(root == null){
            return hi;
        }

        // delete the node with two child
        Node temp = minelement(root.right);
        root.data = temp.data;
        root.right = deleteSingleChild(root.right,temp.data);

        return hi;
    }

    static int countnode(Node root){
        if(root==null){
            return 0;
        }
        return 1 + countnode(root.left) + countnode(root.right);
    }


    static int validBST(Node root,int min,int max){
        if(root == null){
            return 1;
        }
        if(root.data <=min || root.data > max){
            return 0;
        }
        return validBST(root.left,min,root.data) & validBST(root.right,root.data,max);


    }
    public static void main(String[] args){
        int[] arr = {10,5,15,1,7,13,20};

        Node root = null;
        for(int i=0;i<arr.length;i++){
            root = insert(root,arr[i]);
        }

        
        levelorder(root);

        System.out.println("In order traversal ");
        inOrder(root);
        System.out.println();

        System.out.println(search(root,6));

        System.out.println("Min element : "+ minelement(root));
        System.out.println("Max element : "+ maxelement(root));

        // root = deleteSingleChild(root,2);
        // levelorder(root);
        System.out.println("Count : "+countnode(root));
        System.out.println("valid bst : "+validBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        inOrder(root);
        System.out.println();
        System.out.println("After delete the element from the bst");
        // root = deleteSingleChild(root,4);

        inOrder(root);
        System.out.println();
        System.out.println("After delete the element wiht two child in the bst");
        root = deleteTwoChild(root,5);
        inOrder(root);
        System.out.println();

        root = insert(root,5);
        inOrder(root);
        System.out.println();
        root = deleteTwoChild(root,1);
        inOrder(root);
    }
}