package Exemple.Généricite;

public class Main {
    public static void main(String[] args){

        Compte<Character> myAccount = new Compte("Graven", 100, '€');
        myAccount.showBalance();

        Compte<String> otherAccount = new Compte("Bob", 10, "euros");
        otherAccount.showBalance();

        Banque bank = new Banque("GravenBank");
        bank.transfert(myAccount, otherAccount,25);
        
    }


}
