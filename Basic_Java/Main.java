

public class Main{
    public static void main(String[] args){
        BankAccount input = new BankAccount(232323,1000);

        input.deposit(200);
        System.out.println(input.getbalance());
    }
}