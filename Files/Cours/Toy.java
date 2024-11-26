package Files.Cours;

public class Toy {
    private String nom;
    private int price;
    private String desc;
    private int promo;

    public Toy(String nom, int price, String desc , int promo){
        this.nom = nom;
        this.price = price;
        this.desc = desc;
        this.promo = promo;

    }

    public String getName(){
        return nom;
    }

public int getPrice(){
    return price;

}
public String getDesc(){
    return desc;
}
public int getPromo(){
    return promo;
}
@Override
    public String toString() {
        return "Toy{" +
                "name= '" + nom + '\'' +
                ", prix= " + price +
                ", description= '" + desc + '\'' +
                ", rating= " + promo +
                '}';
    }
}
