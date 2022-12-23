import java.util.*;

public class RecursionNumber1 {
    public static void PrintNumber(int n,int num){
        if(n==num){
            return;
        }
            System.out.println(n);
            PrintNumber(n+1,num);
    }
    public static void main(String args[]){
        int n=1;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        PrintNumber(n,num);
    }
    
} 