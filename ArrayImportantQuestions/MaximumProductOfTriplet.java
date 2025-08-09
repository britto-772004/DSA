
class Solution{
    int approach1(int[] array){
        int n = array.length;
        int largest = -1;
        int secondlargest = -1;
        int thirdlargest = -1;

        for(int i=0;i<n;i++){
            // for largest
            if(array[i] > largest){
                thirdlargest = secondlargest;
                secondlargest = largest;
                largest = array[i];
            }
            // this is for second largest
            else if(array[i] > secondlargest && array[i] < largest){
                thirdlargest = secondlargest;
                secondlargest = array[i];
            }
            // this is for third largest
            else if(array[i] > thirdlargest && array[i] < secondlargest && array[i] < largest){
                thirdlargest = array[i];
            }
        }
        return (largest*secondlargest*thirdlargest);

    }
}

public class MaximumProductOfTriplet{
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] array = {1,2,3,4,5,6,7};
        System.out.println("Maximum Triplet : "+obj.approach1(array));
    }
}