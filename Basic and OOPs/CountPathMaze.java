import java.util.*;

public class CountPathMaze {
    public static int Count(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }

        if(i==n-1 & j==n-1){
            return 1;
        }
        int downpath=Count(i+1, j, n, m);
        int  rightpath =Count(i, j+1, n, m);
        return downpath+rightpath;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();

        System.out.print("Enter m:");
        int m=sc.nextInt();

        int a=Count(0, 0, n, m);
        System.out.println(a);

    }
    
}
