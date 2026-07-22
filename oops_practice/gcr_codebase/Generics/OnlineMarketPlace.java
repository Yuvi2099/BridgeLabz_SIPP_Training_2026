import java.util.*;

interface Category {}

class BookCategory implements Category {}
class ClothingCategory implements Category {}
class GadgetCategory implements Category {}

class Product<T extends Category> {

    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " : ₹" + price;
    }
}

public class OnlineMarketPlace {

    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.setPrice(product.price - product.price * percent / 100);
    }

    public static void main(String[] args) {

        List<Product<?>> catalog = new ArrayList<>();

        Product<BookCategory> book =
                new Product<>("Java Book", 800, new BookCategory());

        Product<GadgetCategory> laptop =
                new Product<>("Laptop", 65000, new GadgetCategory());

        catalog.add(book);
        catalog.add(laptop);

        applyDiscount(book, 20);

        for (Product<?> p : catalog)
            System.out.println(p);
    }
}