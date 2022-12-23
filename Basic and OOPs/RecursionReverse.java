import java.util.*;

public class RecursionReverse {
    public static void Reverse(String s,int idx){
        if(idx==0){
            System.out.print(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        Reverse(s,idx-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();

        Reverse(s,s.length()-1);
    }
    
}
