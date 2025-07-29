class Node{
    int data;
    Node next = null;
    Node(int data ){
        this.data = data;
    }
}

public class MyLinkedList{
    Node head = null;

    void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void display(){
        System.out.println("Elements ");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    boolean search(int key){
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    int size(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    void delete(int key){
        Node prev = null;
        Node temp = head;
        while(temp != null ){
            if(temp.data == key){
                prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    void reverse(){
        Node prev = null;
        Node curr = head;
        Node nextn = null;
        while(curr != null){
            nextn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextn;
        }
        head = prev;
    }

    static Node reverseNode(Node head){
        Node prev = null;
        Node curr = head;
        Node nextn = null;
        while(curr != null){
            nextn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextn;
        }
        return prev;
    
    }

    boolean detectloop(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    void formloop(){
        Node temp =head;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = head;
    }

    boolean isPalindrome(){
        Node temp = head;
        Node slow = temp;
        Node fast = temp;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node head2 = slow;
        head2 = reverseNode(head2);
        slow.next = null;

        while(temp !=null){
            if(head2 != null){
                if(temp.data != head2.data){
                    return false;
                }
                head2 = head2.next;
            }
            temp = temp.next;
        }
        return true;
    }
}