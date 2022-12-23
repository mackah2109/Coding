import java.util.*;

public class factorial_function {
    public static void fact(int num){
        int factorial=1;
        for (int i=num;i>=1;i--){
            factorial=factorial*i;
            }
        System.out.print("Factorial of number:");
        System.out.println(factorial);
    }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        fact(num);
    }
}
