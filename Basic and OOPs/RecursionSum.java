import java.util.*;

public class RecursionSum {

    public static void Sum(int n,int num,int add){
        if(num==n){
            add+=n;
            System.out.println(add);
            return;
        }
        add+=n;
        Sum(n+1,num,add);
        

    }
    public static void main(String args[]){
        int n=1;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the range:");
        int num=sc.nextInt();
        Sum(n,num,0);
    }
    
}
