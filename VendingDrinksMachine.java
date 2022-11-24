package ДЗ 1;

import java.util.ArrayList;

public class VendingDrinksMachine implements HotDrinkMachine {
    private ArrayList<HotDrink2> products = new ArrayList<>();
    
    public VendingDrinksMachine(HotDrink2[] products) {
        for (VendingDrinksMachine hotDrink2Prod : products) {
            this.products.add(hotDrink2Prod);
        }
    }

    @Override
    public HotDrink2 getProduct(String name, Double volume, int temperature) {
        for (int i = 0; i < products.size(); i++) {
            
            if (products.get(i).size.equals(volume) && products.get(i).name.equals(name) && products.get(i).temperature==(temperature)) {
                return products.get(i);
            }
        }
        return new HotDrink2Prod("Nothing",  ""  , 0 , 0d);
    }
}