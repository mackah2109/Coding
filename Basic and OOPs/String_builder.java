import java.util.*;

public class String_builder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Muskan");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert at index 2
        sb.insert(2, 'n');
        System.out.println(sb);

        //delete
        sb.delete(2, 3);

        //append (add at end)
        sb.append("m");
        System.out.println(sb);


    }
}
