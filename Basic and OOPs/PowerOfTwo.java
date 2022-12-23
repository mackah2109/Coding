import java.util.*;

public class PowerOfTwo {
    public static boolean power(int n){
        if(n==1){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }n=n/2;
        }return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        if(power(num)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    
    } 
}
