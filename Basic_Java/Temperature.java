import java.util.Scanner;

public class Temperature{
    public static void main(String[] args){
        System.out.println("Temperature converter (celcius to Farenheit )");
        System.out.print("Enter the temperature value : ");
        int cel ;
        Scanner input = new Scanner(System.in);
        cel = input.nextInt();

        double faren ;

        faren = (cel * 9/5) + 32;
        System.out.println(cel + " degree celcius is "+faren+" in  farenheit ");
    }
}