package Piles.Exo3;

import java.util.ArrayDeque;
import java.util.Deque;


public class PileListe<E> implements Piles<E> {
    private Deque<E> elements;

    public PileListe(){
        elements =  new ArrayDeque<>();
        

    }
    @Override
    public void empiler(E element){
        elements.addFirst(element);
    }
    @Override
    public E depiler(){
        if(estVide()){
            throw new IllegalStateException("La pile est vide");

        }
        return elements.removeFirst();

    }
    @Override 
    public E sommet(){
        if(estVide()){
            throw new IllegalStateException("La pile est vide");

        }
        return elements.getFirst();
    }
    @Override
    public boolean estVide(){
        return elements.isEmpty();
    }
   
    @Override
    public String toString() {
        return "PileListe = " + elements; 
    }




    
}

