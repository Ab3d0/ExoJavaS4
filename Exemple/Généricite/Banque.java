package Exemple.Généricite;

public class Banque {
    private String name;

    public Banque(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

   public void  transfert(Compte<Character> sourceAccount, Compte<String> otherAccount, int i){
        if(sourceAccount.getamout() >= amout)
        {
            sourceAccount.removeMoney(amout);

        }
   }
}
