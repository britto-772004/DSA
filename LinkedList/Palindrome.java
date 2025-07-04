import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Palindrome{
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

    static boolean isPalindrome(Node head){
        // find the mid point 

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }


        Node head2 = slow.next;
        slow.next = null;


        // System.out.println("Before reverse ");
        // display(head2);
        // System.out.println("After reverse ");
        head2 = reverselist(head2);
        // display(head2);
        while(head != null && head2 !=null){
            if(head.data != head2.data){
                return false; // not palindrome
            }
            head = head.next;
            head2 = head2.next;
        }
        return true;
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

        if(isPalindrome(head)){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }
}