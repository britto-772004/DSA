public class Stack{
    public static void main(String[] args){
        OwnStack<Character> stack = new OwnStack<>();
        // stack.pop();
        // stack.peek();
        stack.insert('a');
        stack.insert('b');
        stack.display();
        System.out.println("peek : "+stack.peek());
        stack.pop();
        System.out.println("is empty : "+stack.isEmpty());
        System.out.println("Size of the Stack is  : "+stack.size());
    }
}