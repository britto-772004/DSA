import java.util.Arrays;

public class swap{

    static void swapteo(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args){
        int[] arr = {1,2};
        swapteo(arr,0,1);
        System.out.println("swap : "+Arrays.toString(arr));
    }
}