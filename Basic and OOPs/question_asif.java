import java.util.*;

public class question_asif {
    public static void main(String args[]){
        //String GrName[]={"Sapphire","Pearl", "Ruby","Emerald"};
        int Sapphire[]={1,5,9,13,17,21};
        int Pearl[]={2,6,10,14,18,22};
        int Ruby[]={3,7,11,15,19};
        int Emerald[]={4,8,12,16,20,24};

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the roll no(1 to 24) you want to check:");
        int check=sc.nextInt();
        if (check<25){ //if we take 24 student
        for (int i=0;i<Sapphire.length;i++){
            if (Sapphire[i]==check){
                System.out.println("Sapphire");
                break;
            }}
        for (int j=0;j<Pearl.length;j++){
            if(Pearl[j]==check){
                System.out.println("Pearl");
                break;
            }}
            
        for (int k=0;k<Ruby.length;k++){
            if(Ruby[k]==check){
                System.out.println("Ruby");
                break;
            }}
                            
        for (int n=0;n<Emerald.length;n++){
            if (Emerald[n]==check){
                System.out.println("Emerald");
                break;
            }}
        }
        else{
            System.out.println("invalid input");
        }
            
    }
    
}
