

class Solution{
    int approach1(int[] array){
        String str = "";
        for(int i=0;i<array.length;i++){
            str += array[i];
        }

        Integer number = Integer.parseInt(str);
        number++;
        return number;
    }
}

public class ElementsPlusOne{
    public static void main(String[] args){
        Solution obj = new Solution();

        int[] array = {9,9,9};
        System.out.println("Number is : "+obj.approach1(array));
    }
}