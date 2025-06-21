import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord{
    String[] reversewordinarray(String str){
        String[] strarr = str.split(" ");
        String temp;
        for(int i=0,j = strarr.length -1 ;i<=j;i++,j--){
            temp = strarr[i];
            strarr[i] = strarr[j];
            strarr[j] = temp;
        }
        return strarr;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the message : ");
        String str = input.nextLine();
        ReverseWord obj = new ReverseWord();
        String[] output = obj.reversewordinarray(str);
        System.out.println(Arrays.toString(output));
    }
}