import java.util.*;

public class RecursionFib {
    public static void Fib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        Fib(b,c,n-1);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the range:");
        int n=sc.nextInt();
        int a=0, b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        Fib(a,b,n-2);

    }
    
}
