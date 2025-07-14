import java.util.Scanner;

public class IsSort{

    static boolean issort(int[] array){
        for(int i=0; i<array.length-1;i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] array = {1,1,2,3,4,1};

        System.out.println(issort(array));
    }
}