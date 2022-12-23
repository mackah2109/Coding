import java.util.*;

public class Backtracking {
    public static void permu(String s,String perm,int idx){
        if(s.length()==0){
            System.out.println(perm);
            return;
        }
        for (int i=0;i<s.length();i++){
            char currChar=s.charAt(i);
            String newS=s.substring(0,i)+s.substring(i+1);
            permu(newS, perm +currChar, idx+1);

        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter string:");
        String str=sc.next();
        permu(str, "", 0);
        
    }
    
}
