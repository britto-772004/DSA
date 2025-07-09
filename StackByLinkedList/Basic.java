import java.util.Scanner;

class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
    }
}
public class Basic{
    static Node createNode(int data){
        Node newnode = new Node(data);
        return newnode;
    }

    static Node insertAtfirst(Node head,int data){
        Node newnode = createNode(data);
        if(head == null){
            return newnode;
        }

        newnode.next = head;
        head = newnode;
        return head;
    }

    static Node deletesll(Node head){
        if(head == null){
            return head;
        }
        else if(head.next == null){
            return head = null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }

    static int peek(Node head){
        if(head == null){
            return -1;
        }
        return head.data;
    }

    static boolean isEmpty(Node head){
        return head == null;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Node head = null;
        boolean flag = true;
        int peek =0;
        while(flag){
            System.out.println("---------------------------");
            System.out.println("Stack using Linkedlist ");
            System.out.println("1. Insertion");
            System.out.println("2. Delete");
            System.out.println("3. Peek");
            System.out.println("4. IsEmpty ");
            System.out.println("5. Quit");
            System.out.print("Enter your choice : ");
            int data = input.nextInt();
            switch (data){
                case 1:
                    System.out.print("Enter the element to insert : ");
                    data = input.nextInt();
                    head = insertAtfirst(head,data);
                    break;
                case 2:
                    head = deletesll(head);
                    peek = peek(head);
                    if( peek == -1){
                        peek = 0;
                    }
                    
                    System.out.println(peek + " is deleted from the stack ");
                    break;
                case 3:
                    peek = peek( head) ;
                    System.out.println(peek + " is the peek element ");
                    break;
                case 4:
                    System.out.println(isEmpty( head));
                    break;
                case 5:
                    flag = false;
                    System.out.println("Thank you !!"); 
                    break;
            }


        }
    }
}