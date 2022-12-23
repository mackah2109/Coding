import java.util.*;

public class fuctions {

    public static void printMyName(String name){//Camel case
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        String name=sc.next();
        printMyName(name);

    }
    
}
