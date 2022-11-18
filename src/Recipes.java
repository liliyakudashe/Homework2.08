import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Recipes<P extends Product> {
    private String names;
    private List<Product> products;
    private double theTotalCost;

    public Recipes(String name, List<Product> products) {
        this.names = name;
        this.products = products;
        this.theTotalCost = theTotalCost;
    }

    public String getName() {
        return names;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTheTotalCost() {
        for (int i = 0; i < (products.size()); i++){
            theTotalCost += products.get(i).getPrice();
        }
        return theTotalCost;
    }
    //products.get(i).getPrice()

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
        return Double.compare(recipes.theTotalCost, theTotalCost) == 0 && Objects.equals(names, recipes.names) && Objects.equals(products, recipes.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names, products, theTotalCost);
    }
}
