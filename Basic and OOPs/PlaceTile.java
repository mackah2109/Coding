//place tile 1*m in a floor of size n*m

import java.util.*;

public class PlaceTile {
    public static int Place(int n,int m){

        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int vertical=Place(n-m, m);
        //horizontally
        int horizontal=Place(n-1, m);
        return vertical+horizontal;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        System.out.print("enter m:");
        int m=sc.nextInt();

        int a=Place(n, m);
        System.out.println(a);
    }
    
}
