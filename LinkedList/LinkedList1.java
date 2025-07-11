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
        // System.out.print(temp.data+", ");
        while(temp != null){
            System.out.print(temp.data+", ");
            temp = temp.next;
            
        }
        System.out.println();
    } 

    //search the element in linked list - linear search 
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

    // delete a node 

    static Node delete(Node head,int value){
        Node temp = head;
        Node prev = null;

        if(temp.data == value){
            head = temp.next;
            return head;
        }

        while(temp.data != value){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        return head;
    }

    // reverse the link
    static Node reverselist(Node head){
        Node prev = null;
        Node curr = head;
        Node nextn = null;

        while(curr != null){
            nextn = curr.next;
            curr.next = prev;// this will reverse the address
            prev = curr;
            curr = nextn;
        }
        return prev;
    }


    // form loop 
    static Node createloop(Node head){
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head.next;

        return head;
    }

    // remove loop
    static boolean loopdetect(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;

    }

    // mid point finding 

    static void midpoint(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Mid element : "+slow.data);
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
        // find the size of the list 
        System.out.println("Size : "+sizeofll(head));

        // search the element 

        // System.out.print("Enter the element to search : ");
        // int key = input.nextInt();
        // if(search(head,key)){
        //     System.out.println("Element is present ");
        // }
        // else{
        //     System.out.println("Element is not present");
        // }

        // delete the node 

        // System.out.print("Enter the element to delete : ");
        // int deletenode = input.nextInt();
        // head = delete(head,deletenode);
        // display(head);
        // System.out.println(sizeofll(head));

        // // reverse the list 

        // head = reverselist(head);
        // display(head);

        // midpoint(head);

    }
}