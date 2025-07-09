import java.util.Scanner;

class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
    }
}
public class SumOfTwoll{
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

    static void display(Node head){
        System.out.print("Elements are : ");
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    static Node sumoftwonodes(Node head1,Node head2){
        Node sumnode = null;
        int value1 = 0;
        int value2 =0;
        int value = 0;
        while(head1 != null || head2 != null){
            if(head1 ==null){
                 value1 = 0;
                 value2 = head2.data;
            }
            else if(head2 == null){
                 value1 = head1.data;
                 value2 = 0;
            }
            else{
                value1 = head1.data;
                value2 = head2.data;
            }
            value = value1 + value2;

            sumnode = insertAtfirst(sumnode,value);
            

            head1 = head1.next;
            head2 = head2.next;

        }

        return sumnode;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Node head1 = null;
        Node head2 = null;
        
        System.out.println("Enter the elements for the 1st Linked list :");

        while(true){
            System.out.print("Element : ");
            int data = input.nextInt();
            if(data == -1){
                break;
            }
            head1 = insertAtfirst(head1,data);
        }

        display(head1);
        System.out.println("Enter the elements for the 2nd linked list : ");
        while(true){
            System.out.print("Element : ");
            int data = input.nextInt();
            if(data == -1){
                break;
            }
            head2 = insertAtfirst(head2,data);
        }
        display(head2);
        System.out.println("Sum of two Linked list is : ");
        Node answer = sumoftwonodes(head1,head2);
        display(answer);


    }
}