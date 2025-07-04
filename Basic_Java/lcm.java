public class lcm{
    static int gcd(int number1,int number2){
        int numerator,denominator;

        if(number1 > number2){
            numerator = number1;
            denominator = number2;
        }
        else{
            numerator = number2;
            denominator = number1;
        }
        int remainder ;
        while(denominator != 0){
            remainder = numerator % denominator;
            numerator = denominator;
            denominator = remainder;
        }

        return numerator;
    }

    public static void main(String[] args){
        int number1 = 5;
        int number2 = 8;
        int gcd = gcd(number1,number2);
        int lcm = (number1*number2)/gcd;
        System.out.println(gcd+" "+lcm);
    }
}