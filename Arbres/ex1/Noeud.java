package ex1;

import java.util.*;

public class Noeud {
    String value;
    List<Noeud> children;

    public Noeud(String value ){
        this.value= value;
        this.children = new ArrayList<>();

    }

    /*Ajouter un enfant à un noeud */

    public void addChild(Noeud child){
        this.children.add(child);
    }

}
