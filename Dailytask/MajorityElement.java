public class MajorityElement{

    static int majorityelement(int[] array){
        int count =0;
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

        int count_win =0 ;
        for(int i=0;i<array.length;i++){
            if(winner == array[i]){
                count_win++;
            }
        }

        if(count_win > ((array.length)/2)){
            return winner;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array = {2,2,2,2,1,2};

        int output = majorityelement(array);
        if(output == -1){
            System.out.println("No Majority elemetn ");
        }
        else{
            System.out.println("Majority element : "+output);
        }
    }
}