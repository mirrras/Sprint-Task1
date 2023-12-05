import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product {
    private String name;
    private String category;
    private double price;

    public Product() {
    }

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    static Stream<Product> filterProducts(List<Product> products, double minPrice,double maxPrice, String category){
       return products.stream().filter(s-> category == s.getCategory() && minPrice < s.price && maxPrice > s.price);
    }
}
