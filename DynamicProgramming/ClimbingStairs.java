// solve by fibonacci series 

import java.util.Scanner;

public class ClimbingStairs{

    static int climbingstairs(int number){
        if(number == 0){
            return 0;
        }
        else if(number == 1){return 1;}
        else{
            int i = 0;
            int j = 1;
            int temp = 1;
            int answer = 0;
            while(temp <=number){
                answer = i + j;
                i = j;
                j = answer;
                temp++;
            }
            return answer;
        }
    }
    

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        int output = climbingstairs(number);
        System.out.println("Output : "+output);

    }
}