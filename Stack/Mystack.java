import java.util.Stack;

public class Mystack{
    public static void main(String[] args){
        Stack stack = new Stack();
        
        stack.push(5);
        System.out.println(stack.peek());
        // stack.push(2);
        // System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}