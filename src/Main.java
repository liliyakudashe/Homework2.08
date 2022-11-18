import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product banana = new Product(98.56,1.1,"бананы", true);
        Product apricot = new Product(200.52,1.4,"абрикосы",true);
        Product grape = new Product(358.12,1.5,"виноград", true);
        Product macadamia = new Product(1250.45,1.9,"орех макадами", true);
        Product melon = new Product(658.47,2.5,"дыня",true);
        Product raspberry = new Product(487.25,1.8,"малина", true);
        Product yogurt = new Product(112.15, 0.5, "йогурт", true);



        Set<Product> list = new HashSet<>();
        list.add(banana);
        list.add(apricot);
        list.add(raspberry);
        System.out.println(list);


        Recipes fruitSalad = new Recipes("Фруктовый салат", List.of(banana,apricot,melon));
        Recipes fruitSalad2 = new Recipes("Фруктово-ореховый салат", List.of(grape,macadamia,banana));
        Recipes kokteil = new Recipes<>("Молочный коктейль", List.of(yogurt, raspberry));

        Set<Recipes> set = new HashSet<>();
        set.add(fruitSalad);
        set.add(fruitSalad2);
        set.add(kokteil);
        System.out.println(set);

        fruitSalad.getTheTotalCost();
    }

}