public class SumOfDigitsUntilSingleDigit{

    static int digitcounter(int number){
        int count = 0;
        while(number > 0){
            number/=10;
            count++;
        }
        return count;
    }

    static int sumofdigituntilsingledigit(int number){
        int sum = 0;
        int remainder ;
        while(true){
            while(number > 0){
                remainder = number % 10;
                sum += remainder;
                number /=10;
            }
            if(digitcounter(sum) == 1){
                return sum;
            }
            number = sum;
            sum = 0;
        }

        
    }

    public static void main(String[] args){
        int number = 897;

        System.out.println("Sum of digit : "+sumofdigituntilsingledigit(number));
    }
}