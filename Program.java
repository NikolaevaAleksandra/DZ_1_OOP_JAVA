package ДЗ 1;

public class Program{
    import java.util.ArrayList;
    import java.util.List;
    public class Program {
        public static void main(String[] args) {
            List<Product> prods = new ArrayList<>();
            prods.add(new Product("Твикс", 60.0));
            prods.add(new Product("Баунти", 60.0));
            prods.add(new Product("Сникерс", 60.0));
            prods.add(new Milk("Петмол", 65.0, 5));
    
            VendingMachine v1 = new VendingMachine(prods);
    
            System.out.println(v1);
            System.out.println(v1.getProductByName("Лимонад"));
            System.out.println(v1.getProductByCoast(50.0));
  
        }
    }   
}
