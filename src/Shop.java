import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> allProducts = new ArrayList<Product>();

    public void SetProducts(Product product){
        this.allProducts.add(product);
    }

    public void RemoveProducts(ArrayList<Product> products){
        for(int i = 0;i < products.size();i++){
            if(allProducts.contains(products.get(i))){
                allProducts.remove(allProducts.indexOf(products.get(i)));
            }
        }
    }

    @Override
    public String toString() {
        String data = "";
        for(int i = 0;i < allProducts.size();i++){
            data += "\n" + allProducts.get(i).toString();
        }
        return data;
    }
}
