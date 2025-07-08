import java.util.Stack;
import java.util.Scanner;

public class MinimumStack{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Stack<Integer> orgstack = new Stack<>();
        Stack<Integer> minstack = new Stack<>();

        
        System.out.print("Enter the size of the stack : ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements :");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }

        orgstack.push(array[0]);
        minstack.push(array[0]);

        for(int i=1;i<size;i++){
            if(array[i] > minstack.peek()){
                orgstack.push(array[i]);
            }
            else{
                orgstack.push(array[i]);
                minstack.push(array[i]);
            }
        }

        System.out.println("Minimum stack : "+minstack.peek());
    }
}