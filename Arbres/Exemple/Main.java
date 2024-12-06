package Exemple;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <directory>");
            return;
        }

        String directoryPath = args[0];
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Le répertoire spécifié n'existe pas ou n'est pas un répertoire.");
            return;
        }

        Tree tree = new Tree(directory.getName());
        tree.displayTree(tree.root,0);
    }

    public static void construireArbre(File directory ,Noeud parent ){
        if(directory.exists() && directory.isDirectory() ){
            for(File repertoire : directory){
                if(!directory.isDirectory()){
                    Noeud noeud = new Noeud(directory.getName());
                    parent.addChild(noeud);
                }else{
                    Noeud noeud1 = new Noeud(directory.getName());
                    parent.addChild(noeud1);
                    
                }

            }
        }
    }

    public static void displayTree(Noeud node , int de ){

        for(int i = 0 ; i < de; i++){
            System.out.print(" ");
        }
        System.out.println(node.value);

        for(Noeud child : node.children){
            displayTree(child, de + 1);
        }
    }
}
