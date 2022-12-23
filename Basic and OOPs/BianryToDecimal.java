import java.util.*;

public class BianryToDecimal {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter binary number only:");
        int num=sc.nextInt();

        int decimal=0;
        int m=0;
        while(true){
            if (num==0){
                break;
            }
            else{
                int temp=num%10;
                decimal+=temp*Math.pow(2,m);
                num=num/10;
                m++;
            }
        }
        System.out.println(decimal);
    }
}
