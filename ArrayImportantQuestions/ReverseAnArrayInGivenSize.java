import java.util.Arrays;

class Solution{
    int min(int number1,int number2){
        if(number1 < number2){
            return number1;
        }
        return number2;
    }
    void approach1(int[] array,int k){
        int n = array.length;

        for(int i=0;i<n;i+=k){
            int left = i;
            int right = min(i+k-1,n-1);

            int temp;
            while(left < right){
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }
}

public class ReverseAnArrayInGivenSize{
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] array = {1,2,3,4,5,6,7};
        obj.approach1(array,2);
        System.out.println(Arrays.toString(array));
    }
}