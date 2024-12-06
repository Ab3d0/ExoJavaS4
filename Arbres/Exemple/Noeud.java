package Exemple;

import java.util.ArrayList;
import java.util.List;

public class Noeud {
    String value;
    List<Noeud> children;

    public Noeud(String value){
        this.value = value;
        this.children = new ArrayList<>();


    }
    /* Ajoute un enfant au noeud */
    public void addChild(Noeud child){
        children.add(child);
    }


}
