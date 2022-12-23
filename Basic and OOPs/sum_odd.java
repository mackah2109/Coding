import java.util.*;

public class sum_odd {
    public static int sum(int n){
        int add=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                add=add+i;
            }
        }return add;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number:");
        int n =sc.nextInt();
        System.out.print("Sum of odd number:");
        int a=sum(n);
        System.out.println(a);

    }
    
}
