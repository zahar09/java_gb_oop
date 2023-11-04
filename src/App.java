import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Shop shop1 = new Shop();
        Product product1 = new Product("Milk", 10.0f, 4.8f, shop1);
        Product product2 = new Product("Butter", 12.0f, 4.2f, shop1);
        Product product3 = new Product("Butter", 16.0f, 4.0f, shop1);

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        Category category1 = new Category("Молочные продукты", products);

        ArrayList<Product> products2 = new ArrayList<Product>();
        products2.add(product1);
        products2.add(product3);

        Basket basket1 = new Basket(products2);
        User user1 = new User("hg12", "13245", basket1);
        System.out.println(shop1.toString());

        user1.Buy(shop1);
    }
}
