public class Karatsuba{

    static int max(int x,int y){
        if(x > y){
            return x;
        }
        return y;
    }

    static int getzero(int zero){
        int output = 1;
        while(zero > 0){
            output *= 10;
            zero--;
        }

        return output;
    }

    static int digitcount(int number){
        int count = 0;
        while(number > 0){
            number /= 10;
            count++;
        }
        return count;
    }

    static int karatsuba(int x,int y){
        if(x < 10 || y < 10){
            return x*y;
        }

        int n = max(digitcount(x),digitcount(y));
        int halfn = n/2;

        int powerof10 = getzero(halfn);

        int a = x / powerof10;
        int b = x % powerof10;
        int c = y / powerof10;
        int d = y % powerof10;

        int eqn1 = karatsuba(a,c);
        int eqn2 = karatsuba(b,d);
        int eqn3 = karatsuba(a+b,c+d);
        int eqn4 = eqn3 - eqn2 - eqn1;

        int output = (eqn1 * getzero(n)) + (eqn4 * getzero(halfn))+ eqn2;

        return output;
    }

    public static void main(String[] args){
        int number1 = 1234;
        int number2 = 5678;
        System.out.println(karatsuba(number1,number2));
    }
}