import java.util.*;

public class TowerOfHanoi {
    public static void Hanoi(int n,String source,String aux,String dest){
        if (n==1){
            System.out.println("Move disk "+n+" from "+source+" to "+dest);
            return;
        }
        else{
            Hanoi(n-1,source,dest,aux);
            System.out.println("Move disk "+n+" from "+source+" to "+dest);
            Hanoi(n-1, aux, source, dest);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of disk:");
        int disk=sc.nextInt();
        String source="A",aux="B",dest="C";
        Hanoi(disk,source,aux,dest);
    }
    
}
