public class Exponential{

    static int exponential(int number){
        int count = 0;
        while(number > 1){
            if(number % 2 == 0){
                number = number/2;
                count++;
            }
            else{
                return -1;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int n = 0;
        int output = exponential(n);
        if(output == -1){
            System.out.println("It is not exponential");
        }
        else{
            System.out.println(output);
        }
    }
}