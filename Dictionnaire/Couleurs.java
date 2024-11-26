package Dictionnaire;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;

public class Couleurs {
    public static void main(String[] args){


        Couleurs example = new Couleurs();
        example.lecture();

        JFrame fenetre = new JFrame();
        fenetre.setSize(800,400);
        fenetre.setLocation(100,100);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
                    System.out.println("Ligne lue" + ligne);
                    String[] parties = ligne.split("\\s+", 2);

                    if(parties.length >=2){
                        String var1 = parties[0].trim();
                        String var2 = parties[1].trim();
    
                        System.out.println("var1: " + var1);
                        System.out.println("var2: " + var2);
                        
                    }else{
                        System.err.println("Pas deux argument" +ligne);
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

