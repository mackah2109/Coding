import java.util.*;

public class pyramid_pattern {
    public static void main(String args[]){

        int n=7;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");//spaces
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }System.out.println();
        }
        
    }
    
}
