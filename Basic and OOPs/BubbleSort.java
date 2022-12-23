import java.util.*;

public class BubbleSort {
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

        //bubble sort logic
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){ //ascending order
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\nSorted Array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }
    }
    
}
