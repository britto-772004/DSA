import java.util.Scanner;

public class IsSort{
    static boolean issort(int[] array){
        int i = 0;

        for(int j = 1;j<array.length;j++,i++){
            if(array[i] > array[j]){
                // System.out.println("i and j :"+i+" "+j);
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter that "+size+" elements ");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Output : "+issort(arr));
    }
}