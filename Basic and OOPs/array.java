import java.util.*;

public class array {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for (int i=0;i<size;i++){
            System.out.print("Enter the element:");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value you want to search:");
        int val=sc.nextInt();

        for(int i=0;i<size;i++){
            if (arr[i]==val){
                System.out.print("The element found at index "+i);
               // System.out.println(i);
            }
        }

    }
    
}
