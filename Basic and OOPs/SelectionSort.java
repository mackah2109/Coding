import java.util.*;

public class SelectionSort {
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

        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[small]>arr[j]){
                    small=j;
            }
        }
        int temp=arr[small];
        arr[small]=arr[i];
        arr[i]=temp;
            
        }

        System.out.println("\nSorted array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }
    }
    
}
