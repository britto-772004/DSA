class NodeforQueue<T>{
    T data;
    NodeforQueue<T> next = null;
    NodeforQueue(T){
        this.data = data;
    }
}

public class MyQueue<T>{
    NodeforQueue<T> head = null;

    void enqueue(T data){
        NodeforQueue<T> newnode = new NodeforQueue<T>(data);
        if(head == null){
            head = newnode;
            return;
        }
        NodeforQueue<T> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void display(){
        System.out.println("Elements ");
        NodeforQueue<T> temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}