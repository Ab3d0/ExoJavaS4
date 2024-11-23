package Recursivité;

public class exo3 {
    public static void main(String[] args){
        if(args.length > 0){
          
            int number = Integer.parseInt(args[0]);
            int resultat = Fibonacci(number);
            System.out.println("Le " + number + "ème nombre de Fiboccacci est : " + resultat );

        }
    }

    private static int Fibonacci(int n){
        System.out.println("Appel de fibonacci(" + n + ")");

        int result;
        if (n <= 1){
            return n;
        }
        else{
            result = (Fibonacci(n-2) + Fibonacci(n-1));
           
        }
         System.out.println("Appel de fibonacci(" + n + ") = " + result);
        return result;
        
    }
}
