// console

// Enter the String to reverse : 
// helo bye
// Output : eyb oleh

import java.util.Scanner;

public class Reverse{
    char temp;
    String reverse(String str){
        String output="";
        for(int j=str.length()-1 ; j>=0;j--){
            output = output + str.charAt(j);
        }
        return output;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String to reverse : ");

        String str = input.nextLine();
        Reverse obj = new Reverse();
        str = obj.reverse(str);
        System.out.println("Output : "+str);
    }
}