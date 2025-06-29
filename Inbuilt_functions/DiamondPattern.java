



import java.util.Scanner;

public class DiamondPattern{
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        int firsthalf = number/2;
        int secondhalf =  firsthalf;
        for(int i = 0 ;i<= firsthalf;i++){
            // print white spaces

            for(int j = firsthalf - i -1 ; j>= 0 ;j--){
                System.out.print(" ");
            }

            // print star

            for(int j = 2*(i)+1 ; j > 0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =0 ;i<=secondhalf ;i++){
            if(i == 0){continue;}
            // print spaces
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }

            // if(i == 0){continue;}
            // print stars

            for(int j=number - 2*i; j >0;j--){
                
                System.out.print("*");
            }

            
            System.out.println();
        }
    }
}