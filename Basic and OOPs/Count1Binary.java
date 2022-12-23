import java.util.*;

public class Count1Binary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();

        int count =0;
        while(n!=1){
            int d=n%2;
            if(d==1){
                count++;
            }n=n/2;

        }
        System.out.println(count+1);

    }
    
}
