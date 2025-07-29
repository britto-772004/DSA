// import linkedlist.OwnLinkedList;

public class LinkedlistBritto{
    public static void main(String[] args){
        OwnLinkedList<Integer> list = new OwnLinkedList<>();

        list.insertAtFirst(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.display();
        list.reverse();
        list.display();
        list.delete(1);
        list.display();
        System.out.println("Size of the Linked list : "+list.size());
    }
}