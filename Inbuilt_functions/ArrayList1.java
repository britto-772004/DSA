import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1{
    public static void main(String[] args){
        ArrayList<Integer> obj = new ArrayList<>();

        ArrayList<String> obj1 = new ArrayList<>();
        System.out.print("Enter the size of Arraylist : ");

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        

       

        for(int i=0;i<size;i++){
            obj.add(input.nextInt());
        }
        size = obj.size();
        System.out.println("Size of the array list : "+size);

        
        System.out.println("Elements in the arraylist "+obj);
        

        System.out.println(obj.isEmpty());
        System.out.println(obj1.isEmpty());

        System.out.print("After isEmpty() ");
        for(int i=0;i<size;i++){
            System.out.println(obj.get(i));
        }
    }
}