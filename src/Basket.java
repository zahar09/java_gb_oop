import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> purchasedProducts = new ArrayList<Product>();
    public Basket(ArrayList<Product> products){
        this.purchasedProducts = products;
    }

    public void AddProduct(Product product){
        this.purchasedProducts.add(product);
    }
    public ArrayList<Product> GetPurchasedProducts(){
        return this.purchasedProducts;
    }

    @Override
    public String toString() {
        String data = "";
        for(int i = 0;i < purchasedProducts.size();i++){
            data += "\n" + purchasedProducts.get(i).toString();
        }
        return data;
    }
}
