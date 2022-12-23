import java.util.*;

public class array_string {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();
        String arr[]=new String [size];
        int tlength=0;

        for(int i=0;i<size;i++){
            System.out.print("Enter the string:");
            arr[i]=sc.next();
            tlength+=arr[i].length();
        }
        System.out.print("Total length:");
        System.out.println(tlength);

        

    }
    
}
