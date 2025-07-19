
import java.util.Arrays;
import java.util.ArrayList;

public class SieveOfEratostheres{
    
    static  ArrayList<Integer> primenumbers(int number){
        ArrayList<Integer> list = new ArrayList<>();

        boolean[] isprime = new boolean[number+1];
        Arrays.fill(isprime,true);

        for(int p=2; p*p <=number;p++){
            if(isprime[p]){
                for(int i= p*p;i<=number;i+=p){
                    isprime[i] = false;
                }
            }
        }

        for(int i=2;i<=number;i++){
            if(isprime[i]){
                list.add(i);
            }
        }

        return list;
    }
    
    public static void main(String[] args){
        System.out.println(primenumbers(10));
    }
}