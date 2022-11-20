import java.util.*;

public class Recipes<P extends Product> {

    private final Map<Product, Integer> productIntegerMap = new HashMap<>();
    private String names;
    private List<Product> products;

    public Recipes(String name, List<Product> products) {

        if (name == null || name.isBlank()){
            throw new RuntimeException("Нужно заполнить все поля!");
        }
        this.names = name;
        this.products = products;
    }

    public String getName() {
        return names;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product, int quantity){
        if (quantity <= 0){
            quantity = 1;
        }
        if (this.productIntegerMap.containsKey(product)){
            this.productIntegerMap.put(product, quantity);
        }
    }

    public int getTheTotalCost() {
        int theTotalCost = 0;
        for (Map.Entry<Product, Integer> productIntegerEntry : this.productIntegerMap.entrySet()) {
            theTotalCost *= productIntegerEntry.getKey().getPrice() * productIntegerEntry.getValue();
        }
        return theTotalCost;
    }



    @Override
    public String toString() {
        return  names +
                ". Рецепт: " + products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes<?> recipes = (Recipes<?>) o;
        return Objects.equals(names, recipes.names) && Objects.equals(products, recipes.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names, products);
    }
}
