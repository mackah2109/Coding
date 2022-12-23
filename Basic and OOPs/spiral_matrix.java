import java.util.*;

public class spiral_matrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter number of columns:");
        int cols=sc.nextInt();

        int matrix[][]=new int [rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter the element at ("+ i+","+j+") : ");
                matrix[i][j]=sc.nextInt();
            }
        }
        //print normal matrix
        System.out.println("normal matrix:");
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+"  ");
            }System.out.println();
        }

        //traverse spiral order
        System.out.println("Spiral order traverse:");
        
        int rowstrt=0;
        int rowend=rows-1;
        int colstrt=0;
        int colend=cols-1;

        while(rowstrt <= rowend && colstrt <=colend){
            //1
            for(int col=colstrt;col<=colend;col++){
                System.out.print(matrix[rowstrt][col]+" ");
            }
            rowstrt++;

            //2

            for(int row=rowstrt;row<=rowend;row++){
                System.out.print(matrix[row][colend]+ " ");
            }
            colend--;

            //3
            for (int col=colend;col>=colstrt;col--){
                System.out.print(matrix[rowend][col]+" ");
            }
            rowend--;

            //4
            for(int row=rowend;row>=rowstrt;row--){
                System.out.print(matrix[row][colstrt]+" ");
            }
            colstrt++;

            System.out.println();


        }

    }
    
}
