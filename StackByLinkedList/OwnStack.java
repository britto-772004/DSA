class StackBritto<T>{
    T data;
    StackBritto<T> next = null;
    StackBritto(T data){
        this.data = data;
    }
}

public class OwnStack<T>{
    StackBritto<T> head = null; 

    void insert(T data){
        StackBritto<T> newnode = new StackBritto<T>(data);
        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }

    T peek(){
        if(head == null){
            throw new RuntimeException("Stack is Empty bro...");
        }
        return head.data;
    }

    void pop(){
        if(head == null){
            throw new RuntimeException("Stack is empty so can't pop ..");
        }
        head = head.next;
    }

    void display(){
        System.out.println("Elements : ");
        StackBritto<T> temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    boolean isEmpty(){
        return head == null;
    }

    int size(){
        StackBritto<T> temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}