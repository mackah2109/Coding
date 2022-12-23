import java.util.*;

public class calculator {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println("+/-/%//");
        char ch=sc.next().charAt(0);

        switch(ch){
            case '+':
            {
                System.out.println("Add");
                int sum=a+b;
                System.out.println(sum);
                break;
            }
            case '-':
            {
                System.out.println("Sub");
                int sub=a-b;
                System.out.println(sub);
                break;
            }
            case '/':
            {
                System.out.println("Div");
                float div =a/b;
                System.out.println(div);
                break;
            }
            case '%':
            {
                System.out.println("Modulo");
                int mod=a%b;
                System.out.println(mod);
                break;
            }
            default:{
                System.out.println("Invalid");
            }
        }
    }
    }
