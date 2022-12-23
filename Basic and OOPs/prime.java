import java.util.*;

public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        boolean isPrime=true;
        for (int i=2;i<n;i++){
            if(n%i==0){
               isPrime=false;
               break; 
            }
        }
        if(isPrime){
            if (n==1){
                System.out.println("Neither prime nor composite");
            }
            else{
                System.out.println("This is prime");
            }
        }
        else{
            System.out.println("This is not prime");
        }

    }
    
}
