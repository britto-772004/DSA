import java.util.Scanner;

public class ChangeCharacter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        // find mininum value 

        int min = Character.getNumericValue(str.charAt(0));
        int temp ;
        for(int i=1;i<str.length();i++){
            temp = Character.getNumericValue(str.charAt(i));
            if(temp < min && temp != 9 && temp != 0){

                min = temp;
            }
        }
        String output = "";
        for(int i=0;i<str.length();i++){
            temp = Character.getNumericValue(str.charAt(i));
            if(temp != 9 && temp != 0 && temp != min){
                output += (9 - temp);
            }
            else{
                output +=temp;
            }
        } 

        System.out.println(output);  
    }
}