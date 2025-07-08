import java.util.Scanner;
import java.util.Stack;

public class LeadersInArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        
        System.out.print("Enter the size of the stack : ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements :");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }

        // finding leaders
        stack.push(array[size-1]);
        int count = 1;
        // int value ;
        for(int i= size -2;i>=0;i--){
            // value = stack.peek().intValue();
            if(stack.peek() < array[i]){
                stack.push(array[i]);
                count++;
            }
        }

        for(int i=0;i<count;i++){
            System.out.println(stack.pop());
        }

    }
}