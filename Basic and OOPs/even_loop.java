import java.util.*;

public class even_loop {
    public static void main(String args[]){
        System.out.print("Enter the range:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
    
}
