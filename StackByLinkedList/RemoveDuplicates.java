import java.util.Scanner;

class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
    }
}
public class RemoveDuplicates{
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

    static Node removeDuplicates(Node head,int size){
        Node temp = head;
        Node prev = null;
        int[] arr = new int[size];

        while(temp != null){
            if(arr[temp.data]== 1){
                prev.next = temp.next;
                temp = prev.next;
            }
            else{
                arr[temp.data] = 1;
                prev = temp;
                temp = temp.next;
            }
        }

        return head;
    }

    static int highestElement(Node head){
        int max = head.data;
        while(head != null){
            if(max < head.data){
                max = head.data;
            }
            head = head.next;
        }

        return max;
    }

    static void display(Node head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Node head = null;
        int data;
        int size = 0;
        while(true){
            System.out.print("Enter the element : ");
            data = input.nextInt();
            if(data == -1){
                break;
            }
            head = insertAtfirst(head,data);
            size++;

        }
        size = highestElement(head);
        Node removeduplicate = removeDuplicates(head,size+1);
        display(head);

        
    }
}