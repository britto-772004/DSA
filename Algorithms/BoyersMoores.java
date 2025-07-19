import java.util.Scanner;

public class BoyersMoores{

    static int majority(int[] array){
        int count = 0;
        int winner = -1;

        for(int i=0;i<array.length;i++){
            if(count == 0){
                winner = array[i];
                count =1;
            }
            else if(array[i] == winner){
                count++;
            }
            else{
                count--;
            }
        }

        int count_win = 0;
        for(int i=0;i<array.length;i++){
            if(winner == array[i]){
                count_win++;
            }
        }
        int size = array.length;
        if(count_win > (size/2)){
            return winner;
        }
        return 0;
        
    }

    public static void main(String[] args){
        int[] array = {2,2,2,2,1,7,2};

        System.out.println(majority(array));
    }
}