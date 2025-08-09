class NodeforStack<T>{
    T data;
    NodeforStack<T> next;
    NodeforStack(T data){
        this.data = data;
    }
}

public class MyStack<T>{
    NodeforStack<T> head = null;

    void insert(T data){
        NodeforStack<T> newnode = new NodeforStack<T>(data);
        newnode.next = head;
        head = newnode;
    }

    void display(){
        System.out.println("Elements ");
        NodeforStack<T> temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void pop(){
        head = head.next;
    }
    T peek(){
        return head.data;
    }
    boolean isEmpty(){
        return head == null;    
    }
}