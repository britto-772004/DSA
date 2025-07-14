public class Pattern{
    public static void main(String[] args){
        int n =5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<n;j++){
                if(i==j){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }

            for(int j=n;j>=i;j--){
                if(i==j){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i = n-1;i>=1;i--){
            for(int j =1;j<=n;j++){
                if(i==j){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }

            for(int j=n-1;j>=1;j--){
                if(i==j){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } 
}