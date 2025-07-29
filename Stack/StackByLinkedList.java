class StackByLinkedList{

    StackByLinkedList head = null;

    StackByLinkedList(int data){
        int data;
        this.data = data;
        StackByLinkedList next = null;
    }    

    static StackByLinkedList push(int data){
        StackByLinkedList newstack = new StackByLinkedList(data);
        if(head == null){
            return newstack;
        }

        StackByLinkedList temp = newstack;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newstack;
    }

    static int pop(){

    }

    static int peek(){
        
    }
}