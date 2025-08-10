import java.util.Arrays;

class Solution{
    void approach1(int[] array){
        int n = array.length;

        for(int i=0;i<n;i++){
            if(isEven(i)){
                if(! isPositive(array[i])){
                    for(int j=i;j<n;j++){
                        if(isPositive(array[j])){
                            int temp = array[j];
                            while(j>i){
                                array[j] =array[j-1];
                                j--;
                            }
                            array[i] = temp;
                            break;
                        }
                    }
                }
                
            }
            else{
                if(isPositive(array[i])){
                    for(int j=i;j<n;j++){
                        if(!isPositive(array[j])){
                            int temp = array[j];
                            while(j>i){
                                array[j] = array[j-1];
                                j--;
                            }
                            array[i]= temp;
                            break;
                        }
                    }
                }
            }
        }
    }

    static boolean isEven(int number){
        if(number %2 == 0){
            return true;
        }
        return false;
    }
    static boolean isPositive(int number){
        if(number < 0){
            return false;
        }
        return true;
    }
}

public class AternativeSigns{
    public static void main(String[] args){
        Solution obj = new Solution();

        int[] array = {1,2,3,-4,-1,4};
        obj.approach1(array);    
        System.out.println(Arrays.toString(array));
    }
}