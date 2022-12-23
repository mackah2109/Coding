import java.util.*;

public class UniqueSubsequence {
    public static void Subsequence(String s,int idx,String newStr,HashSet<String> set){

        if(idx== s.length()){
            if (set.contains(newStr)){
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar=s.charAt(idx);
        //to be 
        Subsequence(s, idx+1, newStr+currChar,set);

        //not to be
        Subsequence(s, idx+1, newStr,set);
    }
    public static void main(String args[]){
        Scanner  sc =new Scanner(System.in);
        System.out.print("Enter string:");
        String str=sc.next();
        HashSet<String> set=new HashSet<>();
        Subsequence(str, 0,"",set);

    }
    
    
}
