import java.util.Arrays;

public class ReverseElementInArray{

    void reverse(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left < right){
            array[left] = array[left] ^ array[right];
            array[right] = array[left] ^ array[right];
            array[left] = array[right] ^ array[left];

            left++;
            right--;
        }
    }

    public static void main(String[]args){
        int[] array = {1,2,3,4};
        System.out.println("Before reverse : "+Arrays.toString(array));

        ReverseElementInArray obj = new ReverseElementInArray();
        obj.reverse(array);
        System.out.println("After reverse : "+Arrays.toString(array));
    }
}