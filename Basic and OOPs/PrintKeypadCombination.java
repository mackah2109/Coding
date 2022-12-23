import java.util.*;

public class PrintKeypadCombination {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static void PrintComb(String str,int idx, String comb){
        if(idx==str.length()){
            System.out.println(comb);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0'];

        for(int i=0;i<mapping.length();i++){
            PrintComb(str, idx+1, comb+mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the string:");
        String s=sc.next();

        PrintComb(s, 0, "");

    }
    
}
