import java.util.Scanner;

public class SumOfDigits{
    static int sumofdigits(int number){
        int sum = 0;
        while(number > 0){
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        System.out.println("Output : "+sumofdigits(number));
    }
}