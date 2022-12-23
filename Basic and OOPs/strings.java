import java.util.*;

public class strings {
    public static void main(String args[]){
        String firstName="tony";
        String lastName="stark";
        //concatenation
        String fullName=firstName+ " "+ lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        //compare
        if (firstName.compareTo(lastName)==0){
            System.out.println("equal");
        }
        else{
            System.out.println("Not equal");
        }

        String name="My name is Muskan";
        //substring
        String sub=name.substring(5,name.length());
        System.out.println(sub);
    }
    
}
