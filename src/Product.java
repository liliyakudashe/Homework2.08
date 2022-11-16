import java.util.*;

public class Product {
    private double price;
    private double quantity;
    private String name;
    private boolean theProductIsPurchased;

    public Product(double price, double quantity, String name, boolean theProductIsPurchased) {
        if (price == Math.max(0, price)){
            this.price = price;
        } else {
            throw new RuntimeException("Цена должна быть больше 0!");
        }
        if (quantity == Math.max(0, quantity)){
            this.quantity = quantity;
        } else {
            throw new RuntimeException("Вес должен быть больше 0!");
        }

        if (name != null && !name.isEmpty() && !name.isBlank() ) {
            this.name = name;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью!");
        }
        if (!theProductIsPurchased){
            throw new RuntimeException("Товар уже есть в корзине!");
        } else {
            this.theProductIsPurchased = theProductIsPurchased;
        }


    }

    public static Set<Product> basket(Product... p)  {
       Set<Product> groceryBasket = new HashSet<>();
        for (Product product : p) {
                    if (groceryBasket.contains(product))
            throw new RuntimeException("Товар уже есть в корзине!");
        }
        return groceryBasket;
    }
        @Override
        public String toString () {
            return name +
                    ", цена: " + price + " рублей, " +
                    quantity + " кг.";
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Double.compare(product.quantity, quantity) == 0 && theProductIsPurchased == product.theProductIsPurchased && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, quantity, name, theProductIsPurchased);
    }

    public double getPrice () {
            return price;
        }


        public double getQuantity () {
            return quantity;
        }


        public String getName () {
            return name;
        }

    public boolean isTheProductIsPurchased() {
        return theProductIsPurchased;
    }
}