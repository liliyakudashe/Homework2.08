import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product banana = new Product(98.56,1.1,"бананы", true);
        Product apricot = new Product(200.52,1.4,"абрикосы",true);
        Product grape = new Product(358.12,1.5,"виноград", true);
        Product macadamia = new Product(1250.45,1.9,"орех макадами", true);
        Product melon = new Product(658.47,2.5,"дыня",true);
        Product raspberry = new Product(487.25,1.8,"малина", true);



        Set<Product> list = new HashSet<>();
        list.add(banana);
        list.add(apricot);
        list.add(raspberry);
        System.out.println(list);
    }
}