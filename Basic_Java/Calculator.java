import java.util.Scanner;

public class Calculator{
    public static void main(String [] args){
        boolean hi = true;
        Scanner input = new Scanner(System.in);
        int value;
        int number1,number2,result;
        while(hi){
            System.out.println("-------------------\nSimple calculator\n------------------- \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\n  Enter your choice (1-5):");
            value = input.nextInt();

            switch (value){
                case 1:
                    System.out.print("Enter the number 1 : ");
                    number1 = input.nextInt();
                    System.out.print("Enter the number 2 : ");
                    number2 = input.nextInt();
                    result = number1 + number2 ; 
                    System.out.println("Addition of "+number1+" and "+number2+" is "+result);
                    break;
                case 2:
                    System.out.print("Enter the number 1 : ");
                    number1 = input.nextInt();
                    System.out.print("Enter the number 2 : ");
                    number2 = input.nextInt();
                    result = number1 - number2 ; 
                    System.out.println("Subtraction of "+number1+" and "+number2+" is "+result);
                    break;
                case 3 : 
                    System.out.print("Enter the number 1 : ");
                    number1 = input.nextInt();
                    System.out.print("Enter the number 2 : ");
                    number2 = input.nextInt();
                    result = number1 * number2 ; 
                    System.out.println("Multiplication of "+number1+" and "+number2+" is "+result);
                    break;
                case 4:
                    System.out.print("Enter the number 1 : ");
                    number1 = input.nextInt();
                    System.out.print("Enter the number 2 : ");
                    number2 = input.nextInt();
                    result = number1 / number2 ; 
                    System.out.println("Division of "+number1+" and "+number2+" is "+result);
                    break;
                case 5:
                    hi = false;
                    System.out.println("Thankyou....");
                    break;

                default :
                    System.out.println("Select the option correctly between 1 - 5 ");
                    break;

            }
        }

    }
}