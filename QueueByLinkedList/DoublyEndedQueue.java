import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class DoublyEndedQueue{

    static Node head = null;
    static Node tail = null;

    static Node createNode(int data){
        Node newnode = new Node(data);
        return newnode;
    }

    static void insertAtfirst(int data){
        Node newnode = createNode(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    static void insertAtBack(int data){
        Node newnode = new Node(data);
        if(tail == null){
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    static void deleteAtFirst(){
        Node temp = head;
        head = temp.next;
        temp = null;
    }
    static void deleteAtLast(){
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    static int peek(){
        return head.data;
    }
    static boolean isEmpty(){
        return head == null;
    }

    static void display(){
        Node temp = head;
        System.out.println("Elements are : ");
        while(temp !=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter the element : ");
            int data = input.nextInt();
            if(data == -1){
                break;
            }
            insertAtfirst(data);
        }
        display();
        System.out.println("The insertion at the back ");
        insertAtBack(9);
        display();
        System.out.println("Deletion at the First ");
        deleteAtFirst();
        display();
        System.out.println("Deletion at the back ");
        deleteAtLast();
        display();
        System.out.println("peek element : "+peek());
        System.out.println("Empty : "+isEmpty());
    }
}