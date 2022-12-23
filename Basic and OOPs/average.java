import java.util.*;

public class average {
    public static int av(int a,int b, int c){
        int aver;
        aver=(a+b+c)/3;
        return aver;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        System.out.print("Enter third numeber:");
        int c=sc.nextInt();

        System.out.println("Average of number:");
        int average=av(a,b,c);
        System.out.println(average);
    }
}
