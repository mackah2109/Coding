import java.util.*;

public class greater {
    public static int greater(int m,int n){
        if (m>n){
            return m;
        }
        else{
            return n;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter first number:");
        int m=sc.nextInt();
        System.out.print("Enter second number:");
        int n=sc.nextInt();
        int a=greater(m,n);
        System.out.print("Greater number is:");
        System.out.println(a);
    }
    
}
