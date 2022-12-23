//Remove duplicate in a string
import java.util.*;

public class RecursionRemove {
    public static boolean[] map=new boolean[26];

    public static void Remove(String s,int idx,String newStr){
        if(idx==s.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=s.charAt(idx);
        if(map[currChar-'a']){
            Remove(s, idx+1,newStr);
        }
        else{
            newStr+=currChar;
            map[currChar-'a']=true;
            Remove(s, idx+1, newStr);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the string:");
        String str=sc.next();

        String newStr="";
        Remove(str,0,newStr);
    }
    
}
//time complexity= O(n)