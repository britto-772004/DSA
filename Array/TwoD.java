import java.util.Scanner;
import java.util.Arrays;

public class TwoD{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[][] arr;

        System.out.print("Enter the row  size of the array :");
        arr = new int[input.nextInt()][];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the "+i+" row size :");
            arr[i] = new int[input.nextInt()];
            for(int j=0;j<arr[i].length;j++){
                System.out.print("Enter the "+i+","+j+" element : ");
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("Array ");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        
    }
}