import java.util.*;

public class circumference {
    public static double circumference(double radius){
        double c=(2*(3.14))*radius ;
        return c;
    }
    public static void main(String args[]){

        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the radius of circle:");
        float radius=sc.nextInt();
        System.out.print("Circumference of circle:");
        double ci=circumference(radius);
        System.out.println(ci);

    }
    
}
