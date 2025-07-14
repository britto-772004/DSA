// find the largest and the smallest fibonacci number in the given array 

public class SmallestAndLargest{

    static boolean findelement(int[] array,int element ){
        for(int ele : array){
            if(ele == element){
                return true;
            }
        }
        return false;
    }

    static void smallestandlargest(int[] array){
        int lastelement = array[array.length-1];
        int small = lastelement;
        int large = -1;

        

        int first = 0;
        int second = 1;
        int third;
        do{
            third = first+second;
            if(findelement(array,third)){
                if(small > third){
                    small = third;
                }
                if(large < third){
                    large = third;
                }
            }
            first = second;
            second = third;
        }
        while(second <= lastelement);

        System.out.println("Smallest : "+small+" Largest : "+large);
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        smallestandlargest(array);
    }
}