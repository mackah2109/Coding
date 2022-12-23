import java.util.*;

public class Practice {
    
    public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);// for getting inputs
		int t = Integer.parseInt(sc.nextLine());
	    for(int i = 0;i<t;i++){
	        int len =Integer.parseInt(sc.nextLine());	
	        String[] A=sc.nextLine().split(" ");
	        String[] B=sc.nextLine().split(" ");
	        long sum = 0;
	        long diff = 0;
	        for(int j =0;j<len;j++){
	            long Ai = Long.parseLong(A[j]);
	            long Bi = Long.parseLong(B[j]);
				System.out.println("huj"+Ai);
				System.out.println("uhji"+Bi);
	            sum +=Math.abs(Ai-Bi);
	            diff +=Ai-Bi;
	        }
	        if(diff==0){
	            System.out.println(sum/2);
	        }else{
	            System.out.println(-1);
	        }
	    }
		sc.close();
	}
		
}

    
    

