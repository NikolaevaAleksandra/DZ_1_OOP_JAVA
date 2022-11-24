package ДЗ 1;

import java.util.List;
import java.util.logging.Logger;

public class main {
    public static void main(String[] args) {
    
   
        HotDrink2 drink1 = new HotDrink2("Coffee", "$", 80, 0.5d);
        HotDrink2 drink2 = new HotDrink2("Tea", "$", 60, 0.3d);
        HotDrink2 drink3 = new HotDrink2("cappuccino", "$", 90, 0.4d);
    
        HotDrink2[] ass1 = { drink1, drink2, drink3 };
        HotDrink2[] ass2 = { drink2, drink3 };
        
        VendingDrinksMachine machine1 = new VendingDrinksMachine(ass1);
        VendingDrinksMachine machine2 = new VendingDrinksMachine(ass2);
    
    
    
        Logger logger = Logger.getAnonymousLogger();
        logger.info(String.valueOf(machine1.getProduct("Coffee", 0.5d, 80)));
        
        
    }  
}
