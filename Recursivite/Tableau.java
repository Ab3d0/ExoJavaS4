package Recursivite;

import java.util.ArrayList;

public class Tableau {
    public static void main(String[] args){
        ArrayList<Integer> tableau = Methode1(args, 0, new ArrayList<>());
        System.out.println(tableau);

        int pair = Methode2(tableau, 0 , 0);
        System.out.println("Nombre de pair " + pair);

        int max = Methode3(tableau , 0 , 0);
        System.out.println("Nombre le plus grand est " + max);

        
        afficherInverse(tableau, tableau.size() - 1);
        
    }

    
    public static ArrayList<Integer> Methode1(String[] args, int index, ArrayList<Integer> result){

        if(index >= args.length){
            return result;
        }
        int number = Integer.parseInt(args[index]);
        result.add(number);


        return Methode1(args , index + 1 , result);
    }
     

    public static int Methode2(ArrayList<Integer> tableau , int index, int count ){
        
        
        if(index >= tableau.size()){
            return count;
        }
        int number = tableau.get(index);

        if(number %2 ==0){
            count++;
        }
        return Methode2(tableau, index + 1 , count);
    }

    public static int Methode3(ArrayList<Integer> tableau, int index , int max){
        if(index >= tableau.size()){
            return max;
        }
        int number = tableau.get(index);

        if(max < number){
            max = number;
        }

        return Methode3(tableau, index + 1, max);

    }

    public static int afficherInverse(ArrayList<Integer> tableau, int index) {
        // Condition de base
        if (index < 0) {
            return -1;
        }
    
        // Appel récursif
       
    
        System.out.println(tableau.get(index));
        return  afficherInverse(tableau, index - 1);
    }
    
    
       
}
