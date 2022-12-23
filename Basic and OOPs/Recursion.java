import java.util.*;

public class Recursion {
    public static int first=-1;
    public static int last=-1;
    public static void Occurrence(String s,int idx,char element){
        char currChar =s.charAt(idx);

        if(idx==s.length()-1){
            System.out.println("First:"+first);
            System.out.println("Last:"+last);
            return;
        }
        if(currChar==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        Occurrence(s, idx+1, element);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the string:");
        String s=sc.next();

        System.out.print("Enter the letter to find:");
        char element=sc.next().charAt(0);

        Occurrence(s,0, element);
    }
    
}
