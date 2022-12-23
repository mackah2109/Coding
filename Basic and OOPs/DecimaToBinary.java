import java.util.*;

public class DecimaToBinary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        int binary[]=new int [20];

        int index=0;
        while(num>0){
            binary[index++]=num%2;
            num=num/2;
        }

        for (int i=index-1;i>=0;i--){
            System.out.print(binary[i]);
        }
    }
    
}
