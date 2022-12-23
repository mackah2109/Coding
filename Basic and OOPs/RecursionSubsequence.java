import java.util.*;

public class RecursionSubsequence {
    public static void Subsequence(String s,int idx,String newStr){

        if(idx== s.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=s.charAt(idx);
        //to be 
        Subsequence(s, idx+1, newStr+currChar);

        //not to be
        Subsequence(s, idx+1, newStr);
    }
    public static void main(String args[]){
        Scanner  sc =new Scanner(System.in);
        System.out.print("Enter string:");
        String str=sc.next();
        Subsequence(str, 0,"");

    }
    
}
//time complexity = O(2^n)
//it makes in tree form 