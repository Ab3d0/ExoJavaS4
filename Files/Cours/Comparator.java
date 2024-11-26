package Files.Cours;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Comparator {
    public static void main(String[] args){

        List<Toy> jouets =  new ArrayList<>();

        jouets.add(new Toy("Lu garu", 15, "Super jeu de cartes", 5));
        jouets.add(new Toy("Poupée Barbie", 5, "Poupée mannequin", 4));
        jouets.add(new Toy("Lego City", 8, "Ensemble de construction", 5));
        jouets.add(new Toy("Voiture télécommandée", 10, "Voiture rapide et amusante", 3));
        jouets.add(new Toy("Puzzle 1000 pièces", 12, "Puzzle de paysage", 4));
        jouets.add(new Toy("Ballon de football", 7, "Ballon pour jouer au football", 5));

       // Collections.sort(jouets); /* Une liste d'une classe d'un objet Toy */
        Collections.sort(jouets , new PriceComparator());
        // Afficher les caractéristiques de chcun de ces objets 
        for(Toy arg : jouets){
            System.out.println(arg);
        }

    }
}
