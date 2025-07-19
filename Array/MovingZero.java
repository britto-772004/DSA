import java.util.Arrays;

public class MovingZero{
    public static void main(String[] args){
        int[] arr = {20,20,0,0,0,0,90,0,1};

        int temp ;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                for(int j = i+1;j<arr.length;j++){
                    if(arr[j] != 0){
                        temp = arr[i];
                        arr[i]=arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
            
        }
        System.out.println(Arrays.toString(arr));
    }
}