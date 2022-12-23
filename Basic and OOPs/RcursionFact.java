import java.util.*;

public class RcursionFact {
    public static int Fact(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n*Fact(n-1);
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();

        int a;
        a=Fact(n);
        System.out.print("Factorial is:"+a);

    }
    
}
