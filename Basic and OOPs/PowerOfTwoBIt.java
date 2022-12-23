import java.util.*;

public class PowerOfTwoBIt {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        
        /* we know that ever bit which is power of two has only 1 set bit
        so when we add n and n-1 then all the bit of 
        result is zero then it is power of 2*/

        if (n!=0 && (n &(n-1))==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}
