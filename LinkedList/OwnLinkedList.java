// package linkedlist;

class Node<T>{
    T data;
    Node<T> next = null;
    Node(T data){
        this.data = data;
    }
}

public class OwnLinkedList<T>{
    Node<T> head = null;

    void insertAtFirst(T data){
        Node<T> newnode = new Node<T>(data);
        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }

    void insertAtEnd(T data){
        Node<T> newnode = new Node<T>(data);
        if(head == null){
            head = newnode;
        }
        else{
            Node<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    void delete(T data){
        Node<T> temp = head;
        Node<T> prev = null;
        if(temp.data == data){
            head = head.next;
            return;
        }
        while(temp != null){
            if(temp.data == data){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    void reverse(){
        Node<T> prev = null;
        Node<T> curr = head;
        Node<T> nextn = null;

        while(curr != null){
            nextn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextn;
        }
        head =  prev;
    }

    int size(){
        Node<T> temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    void display(){
        Node<T> temp = head;
        System.out.println("Elements ");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    
}