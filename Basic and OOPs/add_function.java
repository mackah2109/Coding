import java.util.*;

public class add_function {

    public static int sum(int num1,int num2){
        int sum=num1+num2;
        return sum;
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        System.out.print("Addition of two number:");
        int sum1=sum(num1, num2);
        System.out.println(sum1);

    }
    
}
