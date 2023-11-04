import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products = new ArrayList<Product>();

    public Category(String categoryName, ArrayList<Product> productsInCategory){
        this.name = categoryName;
        this.products = productsInCategory;
    }
}
