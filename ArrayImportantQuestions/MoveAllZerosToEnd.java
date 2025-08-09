import java.util.Arrays;

class Solution{
    void approach1(int[] array){
        int n = array.length;
        for(int i=0;i<n;i++){
            if(array[i] == 0){
                for(int j=i;j<n;j++){
                    if(array[j] != 0){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        break;
                    }
                }
            }
        }
    }
}

public class MoveAllZerosToEnd{
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] array = {1,2,0,0,0,0,3,0};
        obj.approach1(array);
        System.out.println(Arrays.toString(array));
    }
}