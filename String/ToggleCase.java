// Toggle Case of Each Character

// Input: "JaVa" → Output: "jAvA"

import java.util.Scanner;

public class ToggleCase{

    String togglecase(String str){
        int ascii;
        String output ="";
        for(int i=0;i<str.length();i++){
            ascii = str.charAt(i);
            if( ascii > 64 && ascii < 91){
                ascii +=32;
            }
            else{
                ascii -=32;
            }

            output += (char) ascii;

        }
        return output;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        
        ToggleCase obj = new ToggleCase();
        str = obj.togglecase(str);

        System.out.println(str);
    }
}