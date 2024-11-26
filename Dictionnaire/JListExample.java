package Dictionnaire;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListExample {
    public static void main(String[] args) {
        // Création de la fenêtre principale
        JFrame frame = new JFrame("Exemple de JList");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Données à afficher dans la JList
        String[] items = {"Java", "Python", "C++", "JavaScript", "Go", "Rust"};

        // Création de la JList avec les données
        JList<String> itemList = new JList<>(items);
        itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Une seule sélection possible
        itemList.setVisibleRowCount(5); // Nombre de lignes visibles

        // Ajout de la JList dans un JScrollPane pour permettre le défilement
        JScrollPane scrollPane = new JScrollPane(itemList);

        // Étiquette pour afficher l'élément sélectionné
        JLabel selectedLabel = new JLabel("Sélection : ");
        selectedLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajout d'un écouteur de sélection à la JList
        itemList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Vérifie si l'utilisateur modifie la sélection
                if (!e.getValueIsAdjusting()) {
                    String selectedValue = itemList.getSelectedValue();
                    selectedLabel.setText("Sélection : " + selectedValue);
                }
            }
        });

        // Ajout des composants à la fenêtre
        frame.add(scrollPane, BorderLayout.CENTER); // La liste au centre
        frame.add(selectedLabel, BorderLayout.SOUTH); // Étiquette en bas

        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}
