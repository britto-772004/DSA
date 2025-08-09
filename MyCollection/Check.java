public class Check{
    public static void main(String[] args){
        MyStack<Integer> stack = new MyStack<>();

        stack.insert(1);
        stack.insert(2);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println("peek : "+stack.peek());
        stack.pop();
        System.out.println("Isempty : "+stack.isEmpty());

        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.display();
    }
}