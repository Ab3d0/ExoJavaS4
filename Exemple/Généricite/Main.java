package Exemple.Généricite;

public class Main {
    public static void main(String[] args){

        Compte myAccount = new Compte("Graven", 100, '€');
        myAccount.showBalance();

        Compte otherAccount = new Compte("Bob", 10, "euros");
        otherAccount.showBalance();
    }
}
