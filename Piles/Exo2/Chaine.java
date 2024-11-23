package Piles.Exo2;



import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.*;

public class Chaine {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Aucun argument");
        }else{
            Piles<Integer> piles = new PileListe<>();

            for(String arg : args){
                if(arg.equals("+") || arg.equals("-") || arg.equals("x") || arg.equals("/")){
                   
                   int b = piles.depiler();
                   int a = piles.depiler();
                   int resultat = 0 ;

                    if(arg.equals("+")){
                        resultat = a + b;
                    }else if (arg.equals("-")){
                        resultat = a - b;
                    }else if (arg.equals("x")){
                        resultat = a * b;
                    }else if (arg.equals("/")){
                        if( b == 0){
                            System.out.println("Il est divisible par zéro");
                            return;
                        }
                        resultat = a / b;
                    }else{
                        System.out.println("Marche pas");
                        return;
                    }
                    piles.empiler(resultat);
                  
                    
                }else{
                    try {
                        int number = Integer.parseInt(arg);
                        piles.empiler(number);
                        }catch (NumberFormatException e){
                            System.out.println("Aucun argument invalide" + arg);
                            return;
                        }
                }
               

                
            }
            System.out.println(piles);
            
        }
    }
    

    
}
