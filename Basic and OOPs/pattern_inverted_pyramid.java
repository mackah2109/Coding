import java.util.*;

public class pattern_inverted_pyramid {

    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");//space
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");//star
            }
        System.out.println();
        }
    }
    
}
