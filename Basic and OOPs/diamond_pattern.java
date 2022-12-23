import java.util.*;

public class diamond_pattern {
    public static void main(String args[]){
        //upper half
        int n=4;
        for(int i=0;i<=n;i++){ //i=1
            for (int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)+1;j++){ //2*i-1
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half

        for(int i=n;i>=0;i--){
            for (int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
