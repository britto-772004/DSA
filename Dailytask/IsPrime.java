import java.util.Arrays;

public class IsPrime{
    
    static void primenumbers(int number){
        boolean[] prime = new boolean[number+1];
        
        Arrays.fill(prime,true);
        
        for(int p =2 ; p*p <= number;p++){
            if(prime[p]){
                for(int i= p*p ;i<=number ;i=i+p){
                    prime[i]= false;
                }
            }
        }

        for(int i=2;i<=number;i++){
            if(prime[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        primenumbers(30);
    }
}