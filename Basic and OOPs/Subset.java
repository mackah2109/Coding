//print all the subset of a set of first n natural numbers
import java.util.*;

public class Subset {
    public static void printSubset(ArrayList<Integer>subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void SubSets(int n,ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }

        subset.add(n);
        SubSets(n-1, subset);

        subset.remove(subset.size()-1);
        SubSets(n-1, subset);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n =sc.nextInt();

        ArrayList<Integer> subset =new ArrayList<>();

        SubSets(n, subset);


    }

    
}
//time complexity = O(2^n)