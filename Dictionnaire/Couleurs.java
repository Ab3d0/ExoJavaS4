package Dictionnaire;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;



import javax.swing.*;

public class Couleurs {

    private final Map<String,String> couleurs = new HashMap<>();
    
    public static void main(String[] args){
       

        Couleurs example = new Couleurs();
        example.lecture();

        JFrame fenetre = new JFrame();
        fenetre.setSize(800,400);
        fenetre.setLocation(100,100);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        for(String key : example.couleurs.keySet()){
            listModel.addElement(key);
        }

        JList<String> itemList = new JList<>(listModel);
        itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        itemList.setVisibleRowCount(5);

        JScrollPane scrollPane = new JScrollPane(itemList);

        JLabel selectedLabel = new JLabel();
        selectedLabel.setHorizontalAlignment(SwingConstants.CENTER);

        itemList.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(!e.getValueIsAdjusting()){
                    String selectedKey = itemList.getSelectedValue();
                    if(selectedKey != null){
                        String rgbValue = example.couleurs.get(selectedKey);
                        selectedLabel.setText("Selection : " + rgbValue);

                    }
                }
            }
        });

    JPanel rightPanel = new JPanel(new BorderLayout());
    rightPanel.add(selectedLabel, BorderLayout.CENTER);




    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane, rightPanel);
    splitPane.setDividerLocation(300);
    splitPane.setResizeWeight(0.3);
    fenetre.add(splitPane, BorderLayout.CENTER);

    fenetre.setVisible(true);



       
       
       

    }
    public void lecture(){
        String ligne;
       

        
        try {
            BufferedReader lecture = new BufferedReader(new FileReader("Dictionnaire/rgb.txt"));
            /*Verifier si le fichier est ouvert */
            System.out.println("J'ai lu");
            try{
                while((ligne = lecture.readLine()) != null){
                    ligne = ligne.trim();
                    System.out.println("Ligne lue" + ligne);
                    String[] parties = ligne.split("\\s+", 4);

                    if(parties.length >=4){
                       String[] var = {parties[0].trim(), parties[1].trim(), parties[2].trim()};
                       String rgbValue = String.join(" ",var);

                        String var1= parties[3];
                        String rgbKey = String.join(" ", var1);

                        couleurs.put(rgbKey,rgbValue );

                        for(Map.Entry<String,String> entry : couleurs.entrySet()){
                            System.out.println(entry.getKey() + " " +  entry.getValue());
                        }
                        
                    }else{
                        
                    }
                   

                }
                

                    
            } catch (IOException e) {
            // TODO: handle exception
                System.err.println("Erreur de lecture dans rgb.txt !" );
            }
            try{
                lecture.close();
            } catch(IOException e) {
              System.err.println("Erreur de fermeture de rgb.txt !");
            }
            } catch(FileNotFoundException e) {
            System.err.println("Erreur d'ouverture de rgb.txt !");
          }
    }
}

