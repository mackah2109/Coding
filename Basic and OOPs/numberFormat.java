import java.io.*;
import java.util.*;
import java.text.*;

public class numberFormat {
    
    
    
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            
            Scanner sc=new Scanner(System.in);
            double x=sc.nextDouble();
            
            
            NumberFormat u=NumberFormat.getCurrencyInstance(Locale.US);
            String ind=NumberFormat.getCurrencyInstance(new Locale("en","in")).format(x);
            NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat fr=NumberFormat.getCurrencyInstance(Locale.FRANCE);
            
            System.out.println("US: "+u.format(x));
            System.out.println("India: "+ind);
            System.out.println("China: "+china.format(x));
            System.out.println("France: "+fr.format(x));
            
            
            
        }
    }



