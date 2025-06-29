
import java.util.Scanner;
import java.util.ArrayList;

public class TwoDimesionalArrayList{
    public static void main(String[] args){
        

        Scanner input = new Scanner(System.in);

        int row_size = input.nextInt();
        int coumn_size = input.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(row_size);

        for(int i=0;i<row_size;i++){
            ArrayList<Integer> col = new ArrayList<>();
            for(int j=0;j<coumn_size;j++){
                col.add(input.nextInt());
            }
            list.add(col);
        }


        for(int i=0;i<row_size;i++){
            for(int j=0;j<coumn_size;j++){
                System.out.print(list.get(i).get(j));
            }
            System.out.println();
        }
    }
}