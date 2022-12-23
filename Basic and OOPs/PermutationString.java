import java.nio.file.attribute.PosixFileAttributeView;
import java.util.*;

public class PermutationString {

    public static void PrintPer(String str,String perm){
        if (str.length()==0){
            System.out.println(perm);
            return;
        }
        for (int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            PrintPer(newStr, perm+currChar);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String str=sc.next();

        PrintPer(str, "");


    }
    
}
