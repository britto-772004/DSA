
class Solution{
    int approach1(int[] array){
        int sum = 0;
        int n = array.length;

        for(int i=0;i<n;i++){
            sum += array[i];
        }

        boolean flag = true;
        while(flag){
            if(digitcount(sum) > 1){
                sum = addelements(sum);
            }
            else{
                flag = false;
            }
        }
        return sum;
    }

    static int digitcount(int number){
        int count = 0;
        while(number > 0){
            number /=10;
            count++;
        }
        return count;
    }

    static int addelements(int number){
        int sum = 0;
        int remainder;
        while(number > 0){
            remainder = number %10;
            sum += remainder;
            number /=10;
        }
        return sum;
    }
}

public class RepetiveSum{
    public static void main(String[] args){
        Solution obj = new Solution();

        int[] array = {1,2,3,4,5};
        System.out.println(obj.approach1(array));
    }
}