import java.util.Arrays;

public class Bubblesort{

    static void bubblesort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        // System.out.println("Before sort ");
        // System.out.println(arr.toString());
        bubblesort(arr);
        // System.out.println("After sort ");
        // System.out.println(arr.toString());
    }
}