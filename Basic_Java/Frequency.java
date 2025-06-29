import java.util.Arrays;

class Solution {

    static boolean isPrime(int number){
        if(number == 1 || number == 0){
            return false;
        }

        for(int i=2;i< Math.sqrt(number);i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    static int frequencyCount(int[] array,int element){
        int count = 0;
        for(int ele : array){
            if(ele == element){
                count++;
            }
        }

        return count;
    }
    static boolean checkPrimeFrequency(int[] nums) {
        Arrays.sort(nums);

        int lastprint = -1;
        int countOfElement = 0;
        for(int i=0;i<nums.length;i++){
            if(lastprint != nums[i]){
                countOfElement = frequencyCount(nums,nums[i]);
                if(isPrime(countOfElement)){
                    return true;
                }
                lastprint = nums[i];
            }
        }
        return false;
    }

    public static void main(String[] args){
        int nums[] = {3,0,3,6,3,3};
        System.out.println(checkPrimeFrequency(nums));
        
    }
}