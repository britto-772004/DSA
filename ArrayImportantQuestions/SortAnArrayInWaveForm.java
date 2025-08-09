// change the array into the format - arr[0] ≥ arr[1] ≤ arr[2] ≥ arr[3] ≤ arr[4] ≥ ...
import java.util.Arrays;

class Solution{
    void approach1(int[] array){
        for(int i=0;i<array.length-1;i++){
            if(isEven(i)){
                if(array[i] < array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }

            else{
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }

    static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}




public class SortAnArrayInWaveForm{
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] array = {1,2,3,4,5};

        obj.approach1(array);
        System.out.println(Arrays.toString(array));
    }
}