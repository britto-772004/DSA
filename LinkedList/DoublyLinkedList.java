import java.util.Scanner;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class DoublyLinkedList{

    // create a doubly linked list 
    static Node createdll(int data){
        Node newnode = new Node(data);
        return newnode;
    }

    // insertion 
    static Node insertdll(Node head,int data){
        Node newnode = createdll(data);
        if(head == null){
            return newnode;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next= newnode;
        newnode.prev = temp;

        return head;
    }

    // deletion 

    static Node deletedll(Node head,int value){
        Node temp = head;
        if(head.data == value){
            head = head.next;
            head.prev = null;
            return head;
        }

        while(temp != null && temp.data != value){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next.prev =temp.prev;
            temp.prev.next = temp.next;
        }
        else{
            temp.prev.next = null;
            temp.prev = null;
        }
        return head;

    }


    // display the doubly linked list 
    static void displaydll(Node head){
        System.out.println("Elements in the Doubly linked list are : ");
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }

    // display backward 

    static void displaydllbackwards(Node head){
        while(head.next != null){
            head = head.next;
        }

        System.out.println("Elements in the Double linked list from backwards : ");
        while(head != null){
            System.out.print(head.data+" ");
            head = head.prev;
        }
        System.out.println();
    }


    public static void main(String[] args){

        Node head = null;

        Scanner input = new Scanner(System.in);

        boolean flag = true;

        while(flag){
            System.out.print("Enter the element (-1 => to quit)  :");
            int data = input.nextInt();
            if(data == -1){
                flag = false;
            }
            else{
                head = insertdll(head,data);
            }
        }

        displaydll(head);
        displaydllbackwards(head);
    //     System.out.print("Enter the element to delete : ");
    //     int element = input.nextInt();
    //     head = deletedll(head,element);
    //     displaydll(head);
    }
}