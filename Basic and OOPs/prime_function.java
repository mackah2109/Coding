import java.util.*;

public class prime_function
{
    public static boolean isPrime(int num) 
    {
        for(int i =2;i<=num/2;i++)
        {
            if (num%i==0){
                return false;
                }return true;
        }return true;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the numeber:");
        int num=sc.nextInt(); 
        if (isPrime(num)){
            System.out.println("prime");
        }
        else{
        System.out.println("not Prime");}

    }
}
