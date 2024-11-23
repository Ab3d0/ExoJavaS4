package Piles.Exo3;

public interface Piles<E>{
    void empiler(E element);
        E depiler();
        E sommet();
        boolean estVide();
}
