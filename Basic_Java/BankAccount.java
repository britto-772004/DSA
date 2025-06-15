// for encapsulation 

public class BankAccount{
    private long account_number;
    private int balance;

    BankAccount(long account_number,int balance){
        this.account_number = account_number;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Amount deposit successfully ..");
    }

    public int getbalance(){
        return balance;
    }

    public void withdraw(int amount){
        balance -= amount;
        System.out.println("Withdraw successfully..");
    }
}