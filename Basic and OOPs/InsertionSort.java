import java.util.*;

public class InsertionSort {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the element:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Unsorted array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }

        //logic insertion sort
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current <arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("\nSorted array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }

        
    }
}
