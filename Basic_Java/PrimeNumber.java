import java.util.Scanner;
import java.lang.Math;

public class PrimeNumber{

    static boolean isPrime(int number){
        if(number == 1 || number == 0){
            return false;
        }

        for(int i=2;i< Math.sqrt(number);i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int number = input.nextInt();
        int number = 4;

        if(isPrime(number)){
            System.out.println("It is prime number");
        }
        else{
            System.out.println("It is not prime number");
        }
    }
}