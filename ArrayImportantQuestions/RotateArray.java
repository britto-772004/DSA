import java.util.Arrays;

class Solution{
    void approach1(int[] array,int k){
        
        for(int i=1;i<=k;i++){
            int temp = array[0];
            int j;
            for(j=1;j<array.length;j++){
                array[j-1] = array[j];
            }
            array[j-1] = temp;
        }
    }
}


public class RotateArray{
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] array = {1,2,3};
        obj.approach1(array,2);
        System.out.println(Arrays.toString(array));
    }
}