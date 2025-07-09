import java.util.Scanner;

class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
    }
}

public class BasicOperations{

    static Node head = null;
    static Node tail = null;

    static Node createNode(int value){
        Node newnode = new Node(value);
        return newnode;
    }

    static void insert(int value){
        Node newnode = createNode(value);
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
        
    }

    static void display(){
        System.out.println("The elements in the queue is : ");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
    }

    static void delete(){
        Node temp = head;
        if (head !=null){
            head = head.next;
            temp = null;
        }
        else{
            System.out.println("head is null");
        }
        
    }

    static int peek(){
        return head.data;
    }

    static void isEmpty(){
        if(head != null){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter the element : ");
            int data = input.nextInt();
            if(data == -1){
                break;
            }
            insert(data);
            
        }
        display();
        delete();
        System.out.println("After deletion ");
        display();
        System.out.println("Peek element : "+peek());
        isEmpty();
    }
}