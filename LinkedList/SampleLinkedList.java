class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
    }
}

public class SampleLinkedList{
    static Node createNode(int data){
        Node newnode = new Node( data);
        return newnode;
    }

    static Node insert(Node head,int data){
        Node newnode = createNode(data);
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

    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node insertnode(Node head,Node ele){
        if(head == null){
            return ele;
        }
        Node temp = head;
        while(temp.next != null ){
            temp = temp.next;
        }
        temp.next = ele;
        return head;
    }

    static void reorder(Node head,Node head2){
        Node output = null;
        while(head != null || head2 != null){
            if(head == null){
                output = insert(output,head2.data);
                head2 = head2.next;
            }
            else if(head2 == null){
                output = insert(output,head.data);
                head = head.next;
            }
            else{
                output = insert(output,head.data);
                output = insert(output,head2.data);
                head = head.next;
                head2 = head2.next;
            }
        }

        display(output);
    }

    public static void main(String[] args){
        Node head = null;
        head = insert(head,1);
        head = insert(head,2);
        head = insert(head,3);

        Node head2 = null;
        head2 = insert(head2,1);
        head2 = insert(head2,2);
        head2 = insert(head2,3);

        display(head);
        display(head2);
        reorder(head,head2);
    }
}