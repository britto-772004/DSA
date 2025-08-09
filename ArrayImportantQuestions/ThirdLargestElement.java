
class Solution{
    int approach1(int[] array){
        int n = array.length;
        int largest = -1;
        int secondlargest = -1;
        int thirdlargest = -1;

        for(int i=0;i<n;i++){
            //largest

            if(array[i] > largest){
                thirdlargest = secondlargest;
                secondlargest = largest;
                largest = array[i];
            }
            else if(array[i] > secondlargest && array[i] < largest){
                thirdlargest = secondlargest;
                secondlargest = array[i];
            }

            else if(array[i] > thirdlargest && array[i] < secondlargest && array[i] < largest){
                thirdlargest = array[i];
            }
        }
        return thirdlargest;
    }
}

public class ThirdLargestElement{
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] array = {1,2,1};
        System.out.println("Third largest element : "+obj.approach1(array));
    }
}