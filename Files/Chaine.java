package Files;

import java.util.*;

public class Chaine {
    public static void main (String[] args){
        if(args.length == 0){
            System.out.println("Aucun argument");

        }else{
            Deque<Integer> files = new ArrayDeque<>();

            for(String arg : args){

                int nombre = Integer.parseInt(arg);
                files.add(nombre);
            
            }
            System.out.println(files);

            Deque<Integer> gauche = new ArrayDeque<>();
            Deque<Integer> droite = new ArrayDeque<>();



        }
    }

    public static void separe(Deque<Integer> files, Deque<Integer> gauche , Deque<Integer> droite){

        
    }

    

}
