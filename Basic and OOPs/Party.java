//find the number of ways in which you can invite n
// people to your party ,single or pair
import java.util.*;

public class Party {
    public static int Invite(int n){
        if(n<=1){
            return 1;
        }
        int ways1=Invite(n-1);
        int ways2=(n-1)*Invite(n-2);
        return ways1+ways2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();

        int a=Invite(n);
        System.out.println(a);

    }
    
}
