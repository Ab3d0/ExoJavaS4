package Généricité;
public class Frequence {
    public static void main(String[] args){

    }

    public void Frequent(String[] tableau){
        int maxCount = 0;
        String elementLePlusFrequent;


        for(int i = 0 ; i < tableau.length; i++){
            String currentElement = tableau[i];
            int count = 0;
            for(int j =  0; j < tableau.length; j++){
                String compareElement = tableau[j];
                if(currentElement == compareElement){
                    count++;
                }
                if(count > maxCount){
                   maxCount = count;
                   elementLePlusFrequent = currentElement;
                }
            }
           
        }
        return elementLePlusFrequent;
        
    }
}
