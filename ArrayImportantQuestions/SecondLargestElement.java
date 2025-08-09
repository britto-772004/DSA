import java.util.Arrays;

class Solution{
    int approach1(int[] array){
        // sort it and return the second largest element 

        Arrays.sort(array);

        int n = array.length;

        for(int i=n-2;i>=0;i--){
            if(array[i] != array[i-1]){
                return array[i];
            }
        }
        return -1;
    }
    // it works for only unsorted array
    int approach2(int[] array){
        int n = array.length;
        int largest = -1;
        int secondlargest = -1;

        for(int i=0;i<n;i++){
            if(array[i] > largest){
                secondlargest = largest;
                largest = array[i];
            }
            else if((array[i] > secondlargest) && (array[i] < largest)){
                secondlargest = array[i];
            }
        }
        return secondlargest;
    }
}

public class SecondLargestElement{
    public static void main(String[] args){
        Solution obj = new Solution();

        int[] array = {2,2,2,0};
        
        System.out.println("Second Largest Element (Approach - 2): "+obj.approach2(array));
        System.out.println("Second Largest Element (Approach - 1): "+obj.approach1(array));
        }
    
}