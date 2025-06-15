import java.util.Scanner;
import java.util.Arrays;

public class OneD{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] arr;

        System.out.print("Enter the size of the array : ");
        arr = new int[input.nextInt()];

        for(int i=0;i<arr.length;i++){
            System.out.print(i+" Element : ");
            arr[i]=input.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}