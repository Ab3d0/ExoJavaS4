package Exemple;

public class Tree {
    Noeud root;

    /*La racine de l'arbre */
    public Tree(String rootValue){
        this.root = new Noeud(rootValue);
    }
    /*Methode pour aouter un enfant au noeud */

    public void addChild(Noeud parent, String childValue){
        Noeud child = new Noeud(childValue);
        parent.addChild(child);
    }

   


}
