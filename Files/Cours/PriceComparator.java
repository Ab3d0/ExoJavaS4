package Files.Cours;

import java.util.Comparator;

public class PriceComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy toy1, Toy toy2){
        if(toy1.getPrice() < toy2.getPrice()){
            return -1;
        }else{
            return 1;
        }
        
    }


}
