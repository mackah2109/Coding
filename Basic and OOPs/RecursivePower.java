import java.util.*;

public class RecursivePower {
    public static int Power(int x,int n){
        if (n==0){
            return 1;
        }
        else if(x==0){
            return 0;
        }
        else{
            return x*Power(x, n-1);// for stack height n
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number:");
        int x=sc.nextInt();

        System.out.print("Enter the power:");
        int n=sc.nextInt();
        int a=Power(x,n);

        System.out.println(a);
    }
    
}

// for stack height log n
/* if (n%2==0){
    return Power(x,n/2)*Power(x,n/2);
}
else{
    return x*Power(x,n/2)*Power(x,n/2);
}
*/