import java.util.*;

public class search_2D_array {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns:");
        int cols=sc.nextInt();

        int [][] nums=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter the element "+ i + " and " +j + ":");
                nums[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter the element you want to search:");
        int val=sc.nextInt();

        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (nums[i][j]==val){
                    System.out.println("Value present at location ("+ i+","+j+")");
                }
            }
        }

    }
    
}

