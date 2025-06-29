import java.util.Arrays;

public class ArraysInBuilt{
    public static void main(String[] args){

        int[] arr1 = {4,3,2,1};
        int[] arr2 = {1,2,3,4};

        // sort the array
        Arrays.sort(arr1);

        // // pritn the array by converting to string
        System.out.println(Arrays.toString(arr1));

        // // check the two arrays to equal or not
        System.out.println(Arrays.equals(arr1,arr2));

        // //  fill the dummy values
        Arrays.fill(arr1,9);

        System.out.println(Arrays.toString(arr1));

        // copy the array 
        Arrays.copyOf(arr1,2);
        System.out.println(Arrays.toString(arr1));

        // binary search 
        System.out.println(Arrays.binarySearch(arr2,4));


    }
}