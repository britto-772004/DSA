import java.util.ArrayList;
import java.util.Collections;

class Solution{
    ArrayList<Integer> approach1(int[] array){
        int n = array.length;

        ArrayList<Integer> list = new ArrayList<>();

        int totalbig = array[n-1];
        int tempbig;
        list.add(array[n-1]);
        for(int i=n-1;i>0;i--){
            if(array[i] < array[i-1] && array[i-1] > totalbig){
                list.add(array[i-1]);
                tempbig = array[i-1];
                totalbig = max(totalbig,tempbig);
            }
        }
        Collections.reverse(list);
        return list;
    }

    static int max(int number1,int number2){
        if(number1 > number2){
            return number1;
        }
        return number2;
    }
}

public class LeaderInArray{
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] array = {1, 2, 3, 4, 5, 2};
        System.out.println(obj.approach1(array));
    }
}