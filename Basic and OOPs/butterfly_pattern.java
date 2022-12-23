import java.util.*;

public class butterfly_pattern {
    public static void main(String args[]){
        int n=4;

        //upper half
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){   //1st part 
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){  //  spaces=2*(n-i)
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){   //2nd part
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half 
        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){   //1st part 
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){  //  spaces=2*(n-i)
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){   //2nd part
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
