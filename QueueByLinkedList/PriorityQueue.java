import java.util.Scanner;

class Node{
    int data;
    int priority;
    Node next = null;
    Node(int data,int priority){
        this.data = data;
        this.priority = priority;
    }
}

public class PriorityQueue{
    static Node head = null;
    static Node tail = null;

    static Node createNode(int data,int priority){
        Node newnode = new Node(data,priority);
        return newnode;
    }

    static void insertNode(int data,int priority){
        Node newnode = new Node(data,priority);
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }

        Node temp = head;
        while(temp.next != null && temp.next.priority < newnode.priority){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    static void display(){
        System.out.println("Elements are : ");
        Node temp = head;
        while(temp != null){
            System.out.print("data : "+temp.data+" ");
            System.out.println("Priority : "+temp.priority);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter the element and priority : ");
            int data = input.nextInt();
            int priority = input.nextInt();
            if(data == -1){
                break;
            }
            insertNode(data,priority);
            

        }
        display();
    }
}