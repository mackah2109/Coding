import java.util.*;

public class two_D_array {
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
    }
    
}
