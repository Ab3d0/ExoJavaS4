package Recursivité.Appels;

public class ex01 {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Aucun argument ici");
        }else{
            int number = Integer.parseInt(args[0]);
            int result = Factorielle(number);
            System.out.println("La factorielle de " + number + "! =  " +result);

        }
    }

    public static int Factorielle(int n){
        if ( n == 0){
            dumpStack();
            return 1;
            
        }else{
            int result = n * Factorielle( n - 1);
            return result;
            
        }
    }

    public static void dumpStack(){
        Thread.dumpStack();
    }
    
}
