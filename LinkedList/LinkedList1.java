import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList1{

    // create a node 
    static Node createnode(int data){
        Node newnode = new Node(data);
        return newnode;
    }

    // insertion at end - return head node
    static Node insertion_at_end(Node head,int data){
        Node newnode = createnode(data);
        if(head == null){
            return newnode;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
    }

    // size of the linkedlist 
    static int sizeofll(Node head){
        Node temp = head;
        int count = 1;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        return count;
    }


    // display the linked list
    static void display(Node head){
        Node temp = head;
        System.out.print(temp.data+", ");
        while(temp.next != null){
            
            temp = temp.next;
            System.out.print(temp.data+", ");
        }
        System.out.println();
    } 

    //search the element in linked list 
    static boolean search(Node head,int key){
        Node temp = head;

        while(temp.next != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }




    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Node head = null;

        int data;
        boolean flag = true;
        while(flag){
            System.out.print("Enter the element : ");
            data = input.nextInt();
            if(data == -1){
                flag = false;
            }
            else{
                head = insertion_at_end(head,data);
            }
            
        }
        display(head);
        System.out.println("Size : "+sizeofll(head));
        System.out.print("Enter the element to search : ");
        int key = input.nextInt();
        if(search(head,key)){
            System.out.println("Element is present ");
        }
        else{
            System.out.println("Element is not present");
        }

    }
}