
class Solution{
    static int max(int number1,int number2){
        if(number1 > number2){
            return number1;
        }
        return number2;
    }

    int approach2(int[] array){
        int n = array.length;
        int totalprofit = 0;
        int tempprofit = 0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                tempprofit =  array[j] - array[i];
                // System.out.print(tempprofit+" ");
                totalprofit = max(tempprofit,totalprofit);
            }
        }

        return totalprofit;
    }
}

public class BuyAndSellStock{
    public static void main(String[] args){
        Solution obj = new Solution();

        int[] array = {7, 10, 1, 3, 6, 9, 2};
        // System.out.println("Largest profit : "+obj.approach1(array));
        System.out.println("Largest profit : "+obj.approach2(array));
    }
}