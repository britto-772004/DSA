import java.util.Stack;
import java.util.Scanner;

public class ReverseANumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter the number : ");
        int number = input.nextInt();


        int sizeofstack = 0;
        while(number > 0){
            int remainder = number % 10;
            stack.push(remainder);
            sizeofstack++;
            number /=10;
        }

        int output = 0 ;
        int place = 1;
        for(int i=0;i<sizeofstack;i++){
            output = output + (place * stack.pop());
            place *=10;
        }

        System.out.println("reverse of a number : "+output);
        
    }
}