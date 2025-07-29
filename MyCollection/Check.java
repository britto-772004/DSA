public class Check{
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();
        System.out.println("count : "+list.size());
        System.out.println("search : "+list.search(3));
        list.delete(3);
        list.display();
        list.insert(2);
        list.insert(1);
        // list.reverse();
        list.display();
        // list.formloop();
        System.out.println("Palindrome : "+list.isPalindrome());
        list.display();
        System.out.println("Palindrome : "+list.isPalindrome());
        // System.out.println("Loop detection : "+list.detectloop());
    }
}