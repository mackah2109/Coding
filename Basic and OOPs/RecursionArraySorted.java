import java.util.*;

public class RecursionArraySorted {

    public static boolean CheckSorted(int arr[],int idx){
        if (idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return CheckSorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter element:");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        
        boolean a=CheckSorted(arr, 0);
        if(a==true){
            System.out.println("\nArray is sorted");
        }
        else{
            System.out.println("\nNot Sorted");
        }
    }
    
}
