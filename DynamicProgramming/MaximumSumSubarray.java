
import java.util.Scanner;

public class MaximumSumSubarray{

    static int maximumsumsubarray(int[] arr){
        int currentsum = 0;
        int maxsum = arr[0];

        for(int i=0;i<arr.length-1;i++){
            currentsum = Math.max(arr[i],arr[i+1]);
            maxsum = Math.max(currentsum,maxsum);
        }

        return maxsum;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter that "+size+" elements ");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }

        int result = maximumsumsubarray(arr);
        System.out.println("Output : "+result);

    }
}