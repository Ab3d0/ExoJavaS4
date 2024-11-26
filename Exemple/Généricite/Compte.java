package Exemple.Généricite;

public class Compte<T> {
    private String owner ;
    private double amout;
    private T currency;

    public Compte(String owner, double amout, T currency){
        this.owner = owner;
        this.amout = amout;
        this.currency = currency;
    }

    public String getOwner(){
        return owner;
    }
    public double getamout(){
        return amout;
    }
    public T getCurrency(){
        return currency;
    }

    public void addMoney(int amout){
        this.amout += amout;
    }
    public void removeMoney(int amout){
        this.amout -= amout;
    }

    public void showBalance(){
        System.out.println("Vous avez actuellement " + amout + " " + currency + " sur votre solde !");
    }

}
