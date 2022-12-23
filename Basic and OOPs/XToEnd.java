import java.util.*;

public class XToEnd {
    public static void Change(String str,int idx,int count,String newStr){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newStr+="x";
            }
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if (currChar=='x'){
            count++;
            Change(str, idx+1, count, newStr);
        }
        else{
            newStr+=currChar;
            Change(str, idx+1, count, newStr);
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the string:");
        String str=sc.next();

        Change(str, 0, 0, "");

    }
    
}
