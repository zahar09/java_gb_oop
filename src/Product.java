public class Product {
    private String name;
    private Float price;
    private Float rating;

    public Product(String productName, Float propuctPrice, Float propuctRating, Shop shop){
        this.name = productName;
        this.price = propuctPrice;
        this.rating = propuctRating;
        shop.SetProducts(this);
    }

    @Override
    public String toString() {
        return "name: " + name + " price: " + price.toString() + " rating: " + rating.toString();
    }
}
