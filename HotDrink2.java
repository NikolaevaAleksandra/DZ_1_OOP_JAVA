package ДЗ 1;

public class HotDrink2 extends HotDrink {
    public int temperature;
    

    
    public HotDrink2(String name, String currency, int temp, Double size) {
        super.size = size;
        super.name = name;
        super.currency = currency;
        this.temperature = temp;
    }
    @Override
    public String toString() {
        
        return String.format("Product %s at %s celsius with volume %s", super.name,  this.temperature, super.size);
    }  
}
