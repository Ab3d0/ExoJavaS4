package Généricité;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;



public class Tableau {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Aucun argument n'a été fourni.");
        }else{
            
            String[] original = args;
            String[] copy = Arrays.copyOf(original, 5);
            Arrays.sort(copy);
            System.out.println(Arrays.toString(copy));

           
            


              
        }

    }
}
