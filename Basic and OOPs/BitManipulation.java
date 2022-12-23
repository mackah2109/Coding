import java.util.*;

public class BitManipulation {
    public static void main(String args[]){
        int n=5;
        int pos=1;
        int bitMask=1<<pos;

        //get bit
        if((bitMask & n)==0){
            System.out.println("bit is zero");
        }
        else{
            System.out.println("bit was one");
        }

        //set bit
        int newnumber=bitMask | n;
        System.out.println(newnumber);

        //clear bit
        int newnum=~(bitMask)&n;
        System.out.println(newnum);

        //update bit

        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        if (oper==1){
            int newn=bitMask|n;
            System.out.println(newn);
        }
        else{
            int newnn=~(bitMask)&n;
            System.out.println(newnn);
        }

        
    }
    
}
